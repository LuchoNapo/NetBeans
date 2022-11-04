package com.egg.news.servicios;

import com.egg.news.entidades.Foto;
import com.egg.news.exceptions.MiException;
import com.egg.news.repositorios.FotoRepositorio;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FotoServicio {

    @Autowired
    private FotoRepositorio fotoRepositorio;

    public Foto guardar(MultipartFile archivo) throws MiException {

        if (archivo != null) {

            try {
                Foto foto = new Foto();
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return fotoRepositorio.save(foto);

            } catch (IOException ex) {
                Logger.getLogger(FotoServicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;

    }
}
