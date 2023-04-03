package com.banana69.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * value object值对象
 * 奖品概率信息，奖品编号、库存、概率
 * @author banana9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AwardRateInfo {

    // 奖品ID
    private String awardId;

    // 中奖概率
    private BigDecimal awardRate;

}
