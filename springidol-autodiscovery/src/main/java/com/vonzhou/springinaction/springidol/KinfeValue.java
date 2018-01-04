package com.vonzhou.springinaction.springidol;

        import org.springframework.stereotype.Component;

/**
 * Created by xueyong on 2018/1/4.
 */
@Component("KinfeValue")
public class KinfeValue {
    public String value(){
        return "this is KinfeValue";
    }
}
