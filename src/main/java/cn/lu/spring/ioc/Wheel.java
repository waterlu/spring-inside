package cn.lu.spring.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lu
 * @date 2018/5/22
 */
public class Wheel {

    private Logger logger = LoggerFactory.getLogger(Wheel.class);

    public Wheel() {
        logger.info("Wheel Constructor");
    }

}
