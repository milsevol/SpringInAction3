package com.cui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ExecutionException;


/**
 * Created by xueyong.cui on 2018/9/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring-async.xml"})
public class TestAsyncBeanTest {

    @Autowired
    TestAsyncBean testAsyncBean;

    @Test
    public void test_sayHello4() throws InterruptedException, ExecutionException {
        System.out.println("你不爱我了么?");
        testAsyncBean.sayHello4();
        System.out.println("回的这么慢, 你肯定不爱我了, 我们还是分手吧。。。");
        Thread.sleep(3 * 1000);// 不让主进程过早结束
    }
}