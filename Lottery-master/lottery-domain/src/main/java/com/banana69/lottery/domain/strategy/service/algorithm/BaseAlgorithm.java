package com.banana69.lottery.domain.strategy.service.algorithm;

import com.banana69.lottery.domain.strategy.model.vo.AwardRateInfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽奖算法逻辑
 * 通过SecureRandom 生成随机数.最终去匹配斐波那契数字序列.匹配成功即中奖.
 * 但该随机数多次抽奖后会生成相同数字.这个随机数兑奖概率是否会与设计的概率不一致.因为随机数并没有控制.
 * 看到源码中可以通过设置忽略奖品ID来排除奖品库存为零时改为未中奖.这个实际中奖概率会不会远低于实际设计的概率
 * @author banana69
 */
public abstract class BaseAlgorithm implements IDrawAlgorithm {

    // 斐波那契散列增量，逻辑：黄金分割点：(√5 - 1) / 2 = 0.6180339887，Math.pow(2, 32) * 0.6180339887 = 0x61c88647
    private final int HASH_INCREMENT = 0x61c88647;

    // 数组初始化长度
    private final int RATE_TUPLE_LENGTH = 128;

    // 存放概率与奖品对应的散列结果，strategyId -> rateTuple
    protected Map<Long, String[]> rateTupleMap = new ConcurrentHashMap<>();

    // 奖品区间概率值，strategyId -> [awardId->begin、awardId->end]
    protected Map<Long, List<AwardRateInfo>> awardRateInfoMap = new ConcurrentHashMap<>();

    @Override
    public void initRateTuple(Long strategyId, List<AwardRateInfo> awardRateInfoList) {
        // 保存奖品概率信息
        awardRateInfoMap.put(strategyId,awardRateInfoList);

        //TODO
        String[] rateTuple = rateTupleMap.computeIfAbsent(strategyId,k -> new String[RATE_TUPLE_LENGTH]);

        int cursorVal = 0;
        for(AwardRateInfo awardRateInfo : awardRateInfoList){
            int rateVal = awardRateInfo.getAwardRate().multiply(new BigDecimal(100)).intValue();

            //循环填充概率范围
            for(int i = cursorVal + 1; i <= (rateVal + cursorVal); i++){
                rateTuple[hashIdx(i)] = awardRateInfo.getAwardId();
            }
            cursorVal += rateVal;
        }


    }

    @Override
    public boolean isExistRateTuple(Long strategyId) {
        return rateTupleMap.containsKey(strategyId);
    }

    /**
     * 斐波那契（Fibonacci）散列法，计算哈希索引下标值
     *
     * @param val 值
     * @return 索引
     */
    protected int hashIdx(int val){
        int hashCode = val * HASH_INCREMENT + HASH_INCREMENT;
        return hashCode & (RATE_TUPLE_LENGTH - 1);
    }

}
