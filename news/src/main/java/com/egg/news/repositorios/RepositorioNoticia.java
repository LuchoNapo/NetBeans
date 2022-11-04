/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.news.repositorios;

import com.egg.news.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucho Napo
 */
@Repository
public interface RepositorioNoticia extends JpaRepository<Noticia, Long> {

    @Query("SELECT n FROM Noticia n WHERE n.titulo= :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);

}
