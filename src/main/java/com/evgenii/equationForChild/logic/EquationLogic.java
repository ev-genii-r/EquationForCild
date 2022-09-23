package com.evgenii.equationForChild.logic;

import com.evgenii.equationForChild.beans.Equation;

import java.util.Date;

public class EquationLogic {
    public static Equation generateEquation(){
        Date date = new Date();
        int apple = ((date.getSeconds() + 127) / 2) % 10 +1;
        int banana = ((date.getSeconds() + 127) / 3) % 10 +1;
        int coconut = ((date.getSeconds() + 127) / 7) % 10 +1;
        System.out.println(apple + " " + banana + " " + coconut);
        Equation equation = new Equation(apple, banana, coconut, generateSigns());
        return equation;
    }
    private static int[] generateSigns(){
        int[] sing = {1, 1, 1, 1, 1, 1};
        return sing;
    }
}
