package cn.lu.spring.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lu
 * @date 2018/5/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class IOCWithSpringTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Person person;

    @Autowired
    UserService userService;

    @Test
    public void testAnnotation() {
        logger.info(person.getHead().toString());
    }


}