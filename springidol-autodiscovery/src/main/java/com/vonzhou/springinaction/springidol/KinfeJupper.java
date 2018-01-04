package com.vonzhou.springinaction.springidol;

import javax.inject.Inject;
import javax.xml.ws.Provider;
import java.util.Set;

/**
 * Created by xueyong.cui on 2018/1/4.
 */
public class KinfeJupper {
    private Set<Knife> knives;

    @Inject
    public KinfeJupper(Provider<Knife> knifeProvider){
        for(int i=0;i<5;i++){
            knives.add(knifeProvider.get());
        }
    }

}
