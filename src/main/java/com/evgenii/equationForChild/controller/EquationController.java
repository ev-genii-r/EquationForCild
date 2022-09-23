package com.evgenii.equationForChild.controller;

import com.evgenii.equationForChild.beans.Equation;
import com.evgenii.equationForChild.logic.EquationLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
public class EquationController {
    private Equation equation;
    @PostMapping("/equation")
    public String equationPost(Model model, @RequestParam(defaultValue = "0") String usersAnswer){
        int correctAnswer = equation.getApple() + equation.getCoconut() + equation.getBanana();
        try {
            int answer = Integer.parseInt(usersAnswer);
            if(answer == correctAnswer){
                return "congratulations";
            }else {
                return "error";
            }
        }catch (Exception ex){
            return "error";
        }
    }
    @GetMapping("/equation")
    public String equationGet(Model model){
        equation = EquationLogic.generateEquation();
        int result1 = equation.getApple() * 3;
        int result2 = equation.getApple() + equation.getBanana() * 2;
        int result3 = equation.getBanana() + equation.getCoconut() * 2;
        System.out.println();
        model.addAttribute("result1", result1);
        model.addAttribute("result2", result2);
        model.addAttribute("result3", result3);
        return "equation";
    }
}
