package com.banana69.lottery.domain.strategy.service.draw;

import com.banana69.lottery.domain.strategy.model.req.DrawReq;
import com.banana69.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author banana69
 */
public interface IDrawExec {
    DrawResult doDrawExec(DrawReq req);
}
