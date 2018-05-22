package cn.lu.spring.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author lu
 * @date 2018/5/22
 */
public class MyApplicationAware implements ApplicationContextAware, InitializingBean {

    private Logger logger = LoggerFactory.getLogger(MyApplicationAware.class);

    private ApplicationContext applicationContext;

    public MyApplicationAware() {
        logger.info("MyApplicationAware Constructor");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void scan() {
        String [] names = this.applicationContext.getBeanDefinitionNames();
        for (int i=0; i<names.length; i++) {
            logger.info("beanName=" + names[i]);
        }

//        applicationContext.getBeansWithAnnotation();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("MyApplicationAware afterPropertiesSet()");
    }
}
