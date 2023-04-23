package com.banana69.lottery.domain.award.service.goods.impl;

import com.banana69.lottery.common.Constants;
import com.banana69.lottery.domain.award.model.req.GoodsReq;
import com.banana69.lottery.domain.award.model.res.DistributionRes;
import com.banana69.lottery.domain.award.service.goods.DistributionBase;
import com.banana69.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: banana69
 * @date: 2023/04/11/20:54
 * @description: 实物类奖品
 */
@Component
public class PhysicalGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {
        // 模拟调用实物发奖
        logger.info("模拟调用实物发奖 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

    }


}
