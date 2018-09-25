package com.cui;

import org.springframework.stereotype.Component;

/**
 * Created by xueyong.cui on 2018/9/25.
 */
@Component
public class TestAsyncBean {

    public void sayHello4() throws InterruptedException {
        Thread.sleep(2 * 1000);//网络连接中 。。。消息发送中。。。
        System.out.println("先来一个同步调用");
    }
}
