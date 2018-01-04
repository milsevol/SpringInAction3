package com.vonzhou.springinaction.springidol;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xueyong on 2018/1/4.
 */
public class KinfeJupperTest  extends BaseTest {

    @Autowired(required=false)
    private KinfeJupper kinfeJupper;

    @Test
    public void kinfeJupperTest() throws Exception{
        kinfeJupper.KinfeJupper();
    }
}
