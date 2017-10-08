package com.springinaction.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2017 10 08 11:32.
 */
public class Ticket {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
        Ticket ticket = (Ticket) ctx.getBean("ticket");
        System.out.println(ticket);

        Ticket ticket1 = (Ticket) ctx.getBean("ticket");
        System.out.println(ticket1);

        Ticket tmp1 = (Ticket) ctx.getBean("ticket1");
        System.out.println(tmp1);

        Ticket tmp2 = (Ticket) ctx.getBean("ticket2");
        System.out.println(tmp2);
    }
}
