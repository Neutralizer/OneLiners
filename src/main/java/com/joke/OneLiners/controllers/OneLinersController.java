package com.joke.OneLiners.controllers;

import com.joke.OneLiners.services.OneLinersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OneLinersController {

    private OneLinersService oneLinersService;

    @Autowired
    public OneLinersController(OneLinersService oneLinersService) {
        this.oneLinersService = oneLinersService;
    }

    @GetMapping("/")
    public String showOneLiner(Model model){

        model.addAttribute("oneLiner", oneLinersService.getOneLiner());

        return "onelinersview";

    }
}
