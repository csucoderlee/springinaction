package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2017/1/12.
 */
public class ApplicationContextUtil {

    //final 和 static 这个有时间需要去看看， 有点遗忘这部分的知识了
    private final static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-beans.xml");

    public static Object getBean(String beanid){
        return applicationContext.getBean(beanid);
    }

    public static Object getBean(String beanid, String xmlname){
        return new ClassPathXmlApplicationContext(xmlname).getBean(beanid);
    }
}
