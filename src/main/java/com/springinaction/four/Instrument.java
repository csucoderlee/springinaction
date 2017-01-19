package com.springinaction.four;

import com.springinaction.springidol.Performer;

/**
 * Created by lixiang on 17/1/19.
 */
public class Instrument implements Performer{
    public void perform() {
        System.out.println("instrument's method perform runs");
    }
}
