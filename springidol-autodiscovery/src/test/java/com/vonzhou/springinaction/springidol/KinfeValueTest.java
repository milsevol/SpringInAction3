package com.vonzhou.springinaction.springidol;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by xueyong on 2018/1/4.
 */
public class KinfeValueTest extends BaseTest {
    @Value("this is @Value")
    private String value;

    @Value("#{KinfeValue.value()}")
    private String KinfeValue;

    @Test
    public void valueTest(){
        System.out.println(this.value);
        System.out.println(this.KinfeValue);
    }
}
