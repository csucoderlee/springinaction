package com.springinaction.three;

import com.springinaction.springidol.ApplicationContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by lixiang on 17/1/18.
 *
 * 这个类用来说明如何用注解对属性进行装配，不需要setter方法
 *
 */
public class InstrumentalistOther implements Performer{

    private String song;

    @Autowired
    @Qualifier("guitar")
    //@Autowired 直接标注属性，并删除setter方法
    private com.springinaction.three.Instrument instrument;

    public void setSong(String song){
        this.song = song;
    }

    public void perform() {
        System.out.println("playing" + song);
        instrument.play();
    }


    public static void main(String[] args) {
        InstrumentalistOther instrumentalistOther = (InstrumentalistOther) ApplicationContextUtil.getBean("kenny1", "spring/spring-three.xml");
        instrumentalistOther.perform();
    }

}
