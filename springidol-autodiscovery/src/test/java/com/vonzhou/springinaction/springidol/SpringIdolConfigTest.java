package com.vonzhou.springinaction.springidol;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

/**
 * Created by xueyong on 2018/1/4.
 */
public class SpringIdolConfigTest extends BaseTest{

    @Inject
    private Performer duke;

    @Autowired
    private Performer duke15;

    @Test
    public void springIdolConfigTest() throws Exception{
        duke.perform();
        duke15.perform();
    }
}
