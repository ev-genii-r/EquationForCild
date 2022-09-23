package com.evgenii.equationForChild.controller;

import com.evgenii.equationForChild.logic.EquationLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainPageController {

    @GetMapping("/")
    public String mainGet( Model model) {
        return "redirect:/equation";
    }
}
