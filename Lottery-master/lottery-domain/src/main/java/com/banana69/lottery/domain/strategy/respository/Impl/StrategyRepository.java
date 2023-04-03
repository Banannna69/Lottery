package com.banana69.lottery.domain.strategy.respository.Impl;

import com.banana69.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.banana69.lottery.domain.strategy.respository.IStrategyRepository;
import com.banana69.lottery.infrastructure.dao.IAwardDao;
import com.banana69.lottery.infrastructure.dao.IStrategyDao;
import com.banana69.lottery.infrastructure.dao.IStrategyDetailDao;
import com.banana69.lottery.infrastructure.po.Award;
import com.banana69.lottery.infrastructure.po.Strategy;
import com.banana69.lottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;


/**
 * Created with IntelliJ IDEA.

 * @author: banana69
 * @date: 2023/4/2/00:19
 * @description:
 */
@Component
public class StrategyRepository implements IStrategyRepository{
    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;




    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.selectById(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.selectBatchIds(Collections.singleton(strategyId));
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.selectById(awardId);
    }
}
