package com.csis3275.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model.Model_awo_16;

@Controller
public class controller_awo_16 {
    
    @GetMapping("/bio/Augusta.html")
    public String about(Model model) {
    	Model_awo_16 member = new Model_awo_16();
        model.addAttribute("member", member);
        System.out.println("Controller method invoked!");
        return "bio/Augusta";
    }
}