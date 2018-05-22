package cn.lu.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lu
 * @date 2018/5/22
 */
@Component("person")
public class Person {

    public Head getHead() {
        return head;
    }

//    public void setHead(Head head) {
//        this.head = head;
//    }

    public Person() {
        System.out.print("test");
    }

    @Autowired
    @Qualifier("head")
    private Head head;
}
