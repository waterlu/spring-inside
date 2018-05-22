package cn.lu.spring.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lu
 * @date 2018/5/22
 */
public class Car {

    private Logger logger = LoggerFactory.getLogger(Car.class);

//    public Wheel getWheel() {
//        return wheel;
//    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    private Wheel wheel;

//    public Car(Wheel wheel) {
//        logger.info("Car Constructor");
//        this.wheel = wheel;
//    }

    public Car() {
        logger.info("Car Constructor");
    }

}
