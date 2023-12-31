package com.desafio.devmedia.services;

import com.desafio.devmedia.model.Categoria;
import com.desafio.devmedia.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    public Categoria nome(String nome) {
        Categoria categoria = categoriaRepository.categoria(nome);

        return categoria;
    }

}
