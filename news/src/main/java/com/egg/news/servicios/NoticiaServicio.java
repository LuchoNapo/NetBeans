package com.egg.news.servicios;

import com.egg.news.entidades.Foto;
import com.egg.news.entidades.Noticia;
import com.egg.news.exceptions.MiException;
import com.egg.news.repositorios.RepositorioNoticia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {

    @Autowired
    private RepositorioNoticia noticiaRepositorio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo, Foto foto) throws MiException {

        validarDatos(titulo, cuerpo, foto);

        Noticia noticia = new Noticia();

        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFoto(foto);
        noticia.setAlta(new Date());

        noticiaRepositorio.save(noticia);

    }

    public List<Noticia> listarNoticias() {

        List<Noticia> noticias = new ArrayList<>();

        noticias = noticiaRepositorio.findAll();

        return noticias;

    }

    @Transactional
    public void modificarNoticia(Long id, String titulo, String cuerpo, Foto foto) throws MiException {

        validarDatos(titulo, cuerpo, foto);

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Noticia noticia = respuesta.get();

            noticia.setTitulo(titulo);

            noticia.setCuerpo(cuerpo);

            noticia.setFoto(foto);

            noticiaRepositorio.save(noticia);

        }

    }

    public void validarDatos(String titulo, String cuerpo, Foto foto) throws MiException {

        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El titulo no puede estar vacio");
        }
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiException("El cuerpo no puede estar vacio");
        }
        if (foto == null) {
            throw new MiException("La foto no puede estar vacia");
        }

    }

}
