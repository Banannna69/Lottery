package com.banana69.test;

import com.alibaba.fastjson.JSON;
import com.banana69.lottery.rpc.IActivityBooth;
import com.banana69.lottery.rpc.req.ActivityReq;
import com.banana69.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.security.SecureRandom;


class ApiTest {




    @Test
    public void test_rpc() {
        BigDecimal ZERO = BigDecimal.ZERO;
        System.out.println(ZERO);
        ZERO = ZERO.add(BigDecimal.valueOf(0.6626263844));
        System.out.println(ZERO);

        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt(100));

    }


}
