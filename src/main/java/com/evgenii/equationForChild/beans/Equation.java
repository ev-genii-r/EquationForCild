package com.evgenii.equationForChild.beans;

public class Equation {

    private int apple;
    private int banana;
    private int coconut;

    private int[] signs;

    public Equation(int apple, int banana, int coconut, int[] signs){
        this.apple = apple;
        this.banana = banana;
        this.coconut = coconut;
        this.signs = signs;
    }

    public int getApple() {
        return apple;
    }

    public int getBanana() {
        return banana;
    }

    public int getCoconut() {
        return coconut;
    }

    public int[] getSigns() {
        return signs;
    }
}
