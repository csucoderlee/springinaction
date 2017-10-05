package com.springinaction.ch02;

/**
 * Created by lixiang on 2017 10 05 22:41.
 *
 * 定义了一首普通的诗歌
 */
public class Sonnet29 implements Poem {
    private static final String[] LINES = {"1", "2", "3"};

    public Sonnet29() {
    }

    public void recite() {
        for (int i = 0; i < LINES.length; i++){
            System.out.println(LINES[i]);
        }
    }
}
