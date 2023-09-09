package com.desafio.devmedia.services;

import com.desafio.devmedia.model.Noticias;
import com.desafio.devmedia.repository.NoticiasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {

    private NoticiasRepository noticiasRepository;

    public NoticiaService(NoticiasRepository noticiasRepository) {
        this.noticiasRepository = noticiasRepository;
    }

    public Noticias save(Noticias noticias) {
        return noticiasRepository.save(noticias);
    }

    public List<Noticias> listar() {
        return noticiasRepository.findAll();
    }

}
