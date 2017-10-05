package com.springinaction.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2017 10 05 16:01.
 * 其中有一个参赛者是一位杂技师，实现了performer的接口，接口中输出表演的内容
 */
public class Juggler implements Performer{
    private int beanBags = 3;

    public Juggler() {}

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
