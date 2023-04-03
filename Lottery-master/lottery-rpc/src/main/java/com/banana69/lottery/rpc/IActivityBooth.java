package com.banana69.lottery.rpc;

import com.banana69.lottery.rpc.req.ActivityReq;
import com.banana69.lottery.rpc.res.ActivityRes;

/**
 * 活动展台
 * 1. 创建活
 * 2. 更新活动
 * 3. 查询活动
 */

public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
