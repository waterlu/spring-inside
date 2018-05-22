package cn.lu.spring.ioc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lu
 * @date 2018/5/22
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IOCWithAnnotation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void testAnnotation() {
        Person person = (Person)context.getBean("person");
        logger.info(person.getHead().toString());
    }
}
