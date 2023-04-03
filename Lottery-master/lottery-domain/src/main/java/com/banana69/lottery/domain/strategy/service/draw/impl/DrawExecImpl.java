package com.banana69.lottery.domain.strategy.service.draw.impl;

import com.banana69.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.banana69.lottery.domain.strategy.model.req.DrawReq;
import com.banana69.lottery.domain.strategy.model.res.DrawResult;
import com.banana69.lottery.domain.strategy.respository.IStrategyRepository;
import com.banana69.lottery.domain.strategy.service.draw.DrawBase;
import com.banana69.lottery.domain.strategy.service.draw.IDrawExec;
import com.banana69.lottery.infrastructure.po.Strategy;
import com.banana69.lottery.infrastructure.po.StrategyDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author banana69
 */
@Service("drawExec")
public class DrawExecImpl extends DrawBase implements IDrawExec {

    private Logger logger = LoggerFactory.getLogger(DrawExecImpl.class);

    @Resource
    private IStrategyRepository strategyRepository;

    @Override
    public DrawResult doDrawExec(DrawReq req) {
        logger.info("执行策略抽奖开始，strategyId：{}", req.getStrategyId());

        // 获取抽奖策略配置数据
        StrategyRich strategyRich = strategyRepository.queryStrategyRich(req.getStrategyId());
        Strategy strategy =  strategyRich.getStrategy();
        List<StrategyDetail> strategyDetailList = strategyRich.getStrategyDetailList();

        System.out.println(strategyDetailList);
        return null;
    }
}
