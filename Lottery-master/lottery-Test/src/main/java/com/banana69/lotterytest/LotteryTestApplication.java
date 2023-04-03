package com.banana69.lotterytest;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author banana69
 */
@SpringBootApplication
@Configurable
@EnableDubbo
public class LotteryTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryTestApplication.class, args);
    }

}
