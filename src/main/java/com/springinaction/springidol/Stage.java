package com.springinaction.springidol;

/**
 * Created by lixiang on 17/1/16.
 *
 * IoDH: initialization on demand holder
 */
public class Stage {

    private Stage(){}

    //1.延迟加载, 2.构造方法是私有的, 没办法创建对象调用非静态的方法, 所以这里声明是static, 用类名.方法名进行调用
    public static class StageSingletonHandler{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHandler.instance;
    }
}
