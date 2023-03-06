package com.github.rfronteddu.spring.chucknorrisjoke.controllers;

import com.github.rfronteddu.spring.chucknorrisjoke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController
{
    private final JokeService jokeService;

    // no need for autowire since spring will take care of it in this case
    public JokeController (JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke (Model model) {
        model.addAttribute ("joke", jokeService.getJoke ());

        return "index";
    }
}
