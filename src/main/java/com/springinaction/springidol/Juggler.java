package com.springinaction.springidol;

/**
 * Created by lixiang on 2017/1/12.
 */
public class Juggler implements Performer{

    private int beanBags = 3;

    public Juggler(){

    }

    public Juggler(int beanBags){

        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("杂技演员抛" + beanBags + "袋子");
    }

    public static void main(String[] args) {

        //重载了构造方法，如果要使用不带任何参数的构造方法，就必须要显式声明
        new Juggler().perform();
        Performer performer = (Performer) ApplicationContextUtil.getBean("duke");
        performer.perform();
    }
}
