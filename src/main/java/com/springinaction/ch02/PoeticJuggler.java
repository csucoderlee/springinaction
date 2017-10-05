package com.springinaction.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by lixiang on 2017 10 05 22:37.
 */
public class PoeticJuggler extends Juggler{
    private Poem poem;

    public PoeticJuggler(){}

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("While reciting ...");
        poem.recite();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
        Performer performer = (Performer) ctx.getBean("poeticJuggler");
        performer.perform();
    }
}
