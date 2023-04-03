package com.banana69.lottery.domain.strategy.model.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author banana69
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrawReq {
    // 用户ID
    private String uId;

    // 策略ID
    private Long strategyId;

}
