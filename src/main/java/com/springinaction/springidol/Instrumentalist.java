package com.springinaction.springidol;

/**
 * Created by lixiang on 17/1/17.
 */
public class Instrumentalist implements Performer {

    private String song;

    //接口编程, 可以注入实现Instrument接口的任何类
    private Instrument instrument;

    public void setSong(String song){
        this.song = song;
    }

    public void setInstrument(Instrument instrument){
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
