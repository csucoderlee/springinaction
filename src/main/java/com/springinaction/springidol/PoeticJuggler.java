package com.springinaction.springidol;

/**
 * Created by lixiang on 17/1/12.
 */
public class PoeticJuggler extends Juggler{

    private Poem poem;


    public PoeticJuggler(){}

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    public void perform(){
        super.perform();
        poem.recite();
    }

    public static void main(String[] args) {
        PoeticJuggler poeticJuggler = (PoeticJuggler) ApplicationContextUtil.getBean("poemduke");
        poeticJuggler.perform();
    }
}
