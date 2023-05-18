package com.lansmancai.config.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogDemo {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    public String logMethod() {
        //日志的级别；
        //由低到高   trace
        //可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
        logger.trace("LogDemo trace日志...");
        logger.debug("LogDemo debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        logger.warn("LogDemo warn日志...");
        logger.info("LogDemo info日志...");
        logger.error("LogDemo error日志...");
        return "hello log";
    }
}