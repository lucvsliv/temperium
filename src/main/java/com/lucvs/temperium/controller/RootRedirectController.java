package com.lucvs.temperium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootRedirectController {

    @GetMapping({"/", "/login"})
    public String redirectToFrontendLogin() {
        return "redirect:http://localhost:3000/login";
    }
}
