package cn.lu.spring.ioc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lu
 * @date 2018/5/22
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IOCWithXML {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        try {
            applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
//            applicationContext.start();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @After
    public void after() {
//        if(null != applicationContext) {
//            applicationContext.destroy();
//        }
    }

    @Test
    public void testContext() {
//        Car car = (Car)applicationContext.getBean("car");
        Car car = applicationContext.getBean(Car.class);
        int hashCode = car.hashCode();
        logger.info("car=" + hashCode);

        MyApplicationAware applicationAware = (MyApplicationAware)applicationContext.getBean("myApplicationAware");
        applicationAware.scan();
    }

}
