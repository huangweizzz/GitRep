package com.log.study.test;

import org.apache.log4j.Logger;
import org.junit.Test;



public class Log4jTest {

    @Test
    public void test01(){
        final Logger logger = Logger.getLogger(Log4jTest.class);
        final Logger saveUserLog = Logger.getLogger("saveUserLog");
        if(logger.isDebugEnabled()){
            logger.debug("debug");
        }
        logger.info("info");
        logger.error("error");
        saveUserLog.info("张三,男");

    }
}
