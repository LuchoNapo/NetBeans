package com.egg.news.controladores;

import com.egg.news.entidades.Foto;
import com.egg.news.exceptions.MiException;
import com.egg.news.servicios.NoticiaServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/noticia")//localhost:8080/noticia
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/cargar") //localhost:8080/noticia/cargar
    public String cargar() {

        return "cargarNoticia.html";
    }

    @PostMapping("/carga")
    public String carga(@RequestParam String titulo, Foto foto, String cuerpo) {
        System.out.println("Titulo: " + titulo + " Cuerpo: " + cuerpo);

        try {
            noticiaServicio.crearNoticia(titulo, cuerpo, foto);
        } catch (MiException ex) {
            Logger.getLogger(NoticiaControlador.class.getName()).log(Level.SEVERE, null, ex);
            return "cargarNoticia.html";
        }

        return "/";

    }

}
