package com.banana69.lottery.domain.strategy.model.aggregates;

import com.banana69.lottery.infrastructure.po.Strategy;
import com.banana69.lottery.infrastructure.po.StrategyDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StrategyRich {

    // 策略ID
    private Long strategyId;

    // 策略配置
    private Strategy strategy;

    // 策略明细
    private List<StrategyDetail> strategyDetailList;

}
