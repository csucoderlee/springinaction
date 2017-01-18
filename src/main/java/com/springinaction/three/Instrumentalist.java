package com.springinaction.three;

import com.springinaction.springidol.*;
import com.springinaction.springidol.Performer;

/**
 * Created by lixiang on 17/1/18.
 */
public class Instrumentalist implements Performer {

    private String song;

    //接口编程, 可以注入实现Instrument接口的任何类
    private com.springinaction.springidol.Instrument instrument;

    public void setSong(String song){
        this.song = song;
    }

    public void setInstrument(com.springinaction.springidol.Instrument instrument){
        this.instrument = instrument;
    }

    public void perform() {
        System.out.println("playing" + song);
        instrument.play();
    }


    public static void main(String[] args) {
        Instrumentalist instrumentalist = (Instrumentalist) ApplicationContextUtil.getBean("kenny");
        instrumentalist.perform();
    }
}
