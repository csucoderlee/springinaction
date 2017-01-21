package com.springinaction.four;

import com.springinaction.springidol.ApplicationContextUtil;

/**
 * Created by lixiang on 17/1/19.
 */
public class Audience {

    public void takeSeats(){
        System.out.println("take seats");
    }

    public void turnOffCellPhones(){
        System.out.println("turn off cell phones");
    }

    public void applaud(){
        System.out.println("clap clap clap");
    }

    public void demandRefund(){
        System.out.println("we want our money back");
    }

    public static void main(String[] args) {
        Qiedian qiedianimpl = (Qiedian) ApplicationContextUtil.getBean("qiedian", "spring/spring-four.xml");
        qiedianimpl.qiedian();
    }
}
