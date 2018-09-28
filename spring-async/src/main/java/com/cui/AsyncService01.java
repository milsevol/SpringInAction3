package com.cui;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * Created by xueyong.cui on 2018/9/25.
 */
@Component
public class AsyncService01 {

    public void sayHello4() throws InterruptedException {
        Thread.sleep(2 * 1000);//网络连接中 。。。消息发送中。。。
        System.out.println("回复消息");
    }

    /**
     * 如果spring-async.xml没有这个，@Async注解没有用：
     * <context:annotation-config /><task:annotation-driven />
     * @throws InterruptedException
     */
    @Async
    public void sayHello3() throws InterruptedException {
        Thread.sleep(2 * 1000);//网络连接中 。。。消息发送中。。。
        System.out.println("回复消息");
    }

    @Async
    public ListenableFuture<String> sayHello5(String flag) throws Exception {
        if("1".equals(flag)){
            int i =1/0;
            System.out.println("发送异常的短信");
        }
        System.out.println("发送短信中....");
        Thread.sleep(2 * 1000);//短信发送中
        return new AsyncResult<String>(new String("短信发送完毕"));
    }
}
