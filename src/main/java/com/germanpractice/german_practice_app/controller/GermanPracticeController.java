package com.germanpractice.german_practice_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GermanPracticeController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hella %s!", name);
    }

    @GetMapping("/greet")
    public String greet(Model model) {
        model.addAttribute("greeting", "Hello, welcome to the German Practice App!");
        return "index"; // this refers to the index.html template
    }

    @GetMapping("/dictionary")
    public String dictionary(Model model) {
        model.addAttribute("greeting", "Hello, welcome to the German Practice App!");
        return "dictionary"; // this refers to the index.html template
    }

}
