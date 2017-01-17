package com.springinaction.springidol;

/**
 * Created by lixiang on 17/1/17.
 *
 * 表演大厅, 业务上默认只有一个实例. 开灯和关灯对应的bean的初始化和销毁
 */
public class Auditorium {

    public void turnOnLights(){
        System.out.println("bean init method exe");
    }

    public void turnOffLights(){
        System.out.println("bean destroy method exe");
    }

    public static void main(String[] args) {
        Auditorium auditorium = (Auditorium) ApplicationContextUtil.getBean("auditorium");
    }
}
