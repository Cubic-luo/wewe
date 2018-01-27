package com.xp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Rest {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("name","xp");
        return "index";
    }
}
