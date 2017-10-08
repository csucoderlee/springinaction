package com.springinaction.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2017 10 06 16:28.
 * 通过Initialization on demand holder的方式来创建一个舞台的单例
 */
public class Stage {

    private Stage() {
    }

    private static class StageSingleHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingleHolder.instance;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
        Stage stage = (Stage) ctx.getBean("stage");
        System.out.println(stage.getInstance());
    }
}
