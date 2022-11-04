package com.egg.news.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalControlador {

    @GetMapping("/")
    public String index() {

        return "Inicio.html";
    }

}
