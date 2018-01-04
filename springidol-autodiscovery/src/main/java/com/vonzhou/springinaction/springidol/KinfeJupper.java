package com.vonzhou.springinaction.springidol;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by xueyong.cui on 2018/1/4.
 */
@Component("kinfeJupper")
public class KinfeJupper {

    private Set<Knife> knives;

    @Inject
    public KinfeJupper(Provider<Knife> knifeProvider){
        knives = new HashSet<Knife>();
        for(int i=0;i<5;i++){
            knives.add(knifeProvider.get());
        }
    }
    public void KinfeJupper(){
        Iterator<Knife> its = knives.iterator();
        while (its.hasNext()) {
            Knife it = its.next();
            it.play();
        }
    }

}
