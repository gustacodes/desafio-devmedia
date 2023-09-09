package com.desafio.devmedia.controller;

import com.desafio.devmedia.model.Categoria;
import com.desafio.devmedia.services.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("categoria");
        return mv;
    }

    @PostMapping
    public ModelAndView cadastrar(Categoria categoria) {
        ModelAndView mv = new ModelAndView("categoria");
        categoriaService.salvar(categoria);
        return mv;
    }

}
