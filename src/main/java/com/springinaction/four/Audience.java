package com.springinaction.four;

import com.springinaction.springidol.ApplicationContextUtil;
import org.aspectj.lang.ProceedingJoinPoint;

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

    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("the audience is taking their seats");
            System.out.println("the audience is turning off their cellphones");
            long start = System.currentTimeMillis();

            joinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("took time is" + (end - start) + " milliseconds");
            System.out.println();
        } catch (Throwable e){
            System.out.println(" biaoyan shibai");
        }
    }

    public static void main(String[] args) {
        Qiedian qiedianimpl = (Qiedian) ApplicationContextUtil.getBean("qiedian", "spring/spring-four.xml");
        qiedianimpl.qiedian();
    }
}
