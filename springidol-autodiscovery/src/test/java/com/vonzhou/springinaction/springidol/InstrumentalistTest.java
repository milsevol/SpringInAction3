package com.vonzhou.springinaction.springidol;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by xueyong.cui on 2018/1/4.
 */
public class InstrumentalistTest extends BaseTest{

    @Autowired(required=false)
    private Instrumentalist eddie;

    @Test
    public void performTest() throws Exception{
        eddie.perform();
    }
}
