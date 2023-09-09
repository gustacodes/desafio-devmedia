package com.desafio.devmedia.repository;

import com.desafio.devmedia.model.Noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiasRepository extends JpaRepository<Noticias, Long> {

    @Query(value = "SELECT * FROM noticias WHERE titulo ILIKE %:busca%", nativeQuery = true)
    List<Noticias> buscarPorTituloContendo(@Param("busca") String busca);

    @Query(value = "SELECT * FROM noticias ORDER BY id DESC" , nativeQuery = true)
    List<Noticias> findAll();

}
