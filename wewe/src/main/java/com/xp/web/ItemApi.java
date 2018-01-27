package com.xp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemApi {
    private final Logger log = LoggerFactory.getLogger(ItemApi.class);

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "xp");
        return "index";
    }
}
