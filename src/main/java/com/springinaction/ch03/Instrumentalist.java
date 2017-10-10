package com.springinaction.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2017 10 08 16:12.
 * 一个乐器演奏家
 */
public class Instrumentalist implements Performer{

    private String song;
    private Instrument instrument;

    public Instrumentalist() {

    }

    public void perform() {
        System.out.println(" 表演唱歌 歌曲为"  + song + ":" );
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {  // 注入歌曲
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
        Performer performer = (Performer) ctx.getBean("Instrumentalist");
        performer.perform();
    }
}
