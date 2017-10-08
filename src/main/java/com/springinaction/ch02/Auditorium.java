package com.springinaction.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2017 10 08 15:32.
 * 选秀大赛的场地，表演大厅，选秀开始时，要做一些准备工作，开灯，结束时，关灯
 */
public class Auditorium {

    public void turnOnLights(){
        System.out.println(" turn on lights");
    }

    public void turnOffLights() {
        System.out.println(" turn off lights");
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
    }
}
