package com.googleNahsang.DemoBook.controller;


import com.googleNahsang.DemoBook.entity.Angel;
import com.googleNahsang.DemoBook.service.AngelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/angel")
public class AngelController {


    @Autowired
    private AngelService angelService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/")
    public String displayAllAngels(Model model){
        List<Angel> angel = angelService.getAllAngel();
        model.addAttribute("angel",angel);
        return"ListOfAngels";
    }

    @GetMapping("/add")
    public String addAngel(Model model){
        model.addAttribute("angel",new Angel());
        return "addAngel";
    }

      @PostMapping("/add")
    public String addAngel(@ModelAttribute("angel")Angel angel){
        angelService.saveAngel(angel);
        return "redirect:/angel/";
      }


}
