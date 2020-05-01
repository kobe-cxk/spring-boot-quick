package com.huawei.springbootquick;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootQuickApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        //级别，由低到高
        logger.trace("trace");
        //调试
        logger.debug("debug");
        //info
        logger.info("info");
        //警告
        logger.warn("warn");
        //错误
        logger.error("error");
    }

}
