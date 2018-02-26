package com.vonzhou.spitter.persistence.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vonzhou on 16/4/5.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dataSource-context.xml");
        JdbcSpitterDao dao = (JdbcSpitterDao)context.getBean("jdbcSpitterDao");


//        Spitter s = new Spitter();
//        s.setFullName("崔雪勇");
//        s.setUsername("chown");
//        s.setEmail("109@qq.com");
//        s.setPassword("jsdkfj");
//
//        dao.addSpitter(s);

      //  Spitter spitter = dao.getSpitterById(1);
      //  System.out.println(spitter.getUsername());
        Spitter spitter = dao.getSpitterById(5);
        System.out.println(spitter.getFullName());

    }
}
