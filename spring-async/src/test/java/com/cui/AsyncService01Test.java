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
 * Created by xueyong.cui on 2018/9/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring-async.xml"})
public class AsyncService01Test {

    @Autowired
    AsyncService01 asyncService01;

    @Test
    public void test_sayHello4() throws InterruptedException, ExecutionException {
        System.out.println("发送消息");
        asyncService01.sayHello4();// 因为是同步的，所以要先执行这个，才能执行下去
        System.out.println("回得这么慢");
        Thread.sleep(3 * 1000);// 不让主进程过早结束
    }


    @Test
    public void test_sayHello3() throws InterruptedException, ExecutionException {
        System.out.println("发送消息");
        asyncService01.sayHello3();// 因为是异步的，所以可以直接往下面执行
        System.out.println("回得这么慢");
        Thread.sleep(3 * 1000);// 不让主进程过早结束
    }


    @Test
    public void test_sayHello5() throws Exception {
        System.out.println("开始发送短信");
        ListenableFuture<String> sendResult= asyncService01.sayHello5("1");//sayHello5是异步的有返回值
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