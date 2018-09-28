package com.cui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.concurrent.ExecutionException;


/**
 * Created by xueyong.cui on 2018/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring-async.xml"})
public class AsyncService02Test {

    @Autowired
    AsyncService02 asyncService02;

    @Test
    public void test_sayHello1() throws InterruptedException, ExecutionException {
        System.out.println("发送消息");
        asyncService02.sayHello1();//asyncService02 所有的方法都是异步的
        System.out.println("回得这么慢");
        Thread.sleep(3 * 1000);// 不让主进程过早结束
    }

    @Test
    public void test_sayHello2() throws Exception {
        System.out.println("开始发送短信");
        ListenableFuture<String> sendResult= asyncService02.sayHello2("1");//sayHello2是异步的，但是有返回值
        sendResult.addCallback(new ListenableFutureCallback<String>() {
            public void onFailure(Throwable throwable) {
                System.out.println("异步发送处理失败");
            }
            public void onSuccess(String workResult) {
                System.out.println("发送结果:"+workResult);
                System.out.println("短信怎么发这么久?");
            }
        });
        System.out.println("我已经点击发送短信的按钮了");
        Thread.sleep(3 * 1000);// 不让主进程过早结束
    }

}