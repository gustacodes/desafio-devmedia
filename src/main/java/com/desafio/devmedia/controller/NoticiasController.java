package com.desafio.devmedia.controller;

import com.desafio.devmedia.services.CategoriaService;
import com.desafio.devmedia.services.NoticiaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/noticias")
public class NoticiasController {

    private NoticiaService noticiaService;
    private CategoriaService categoriaService;

    public NoticiasController(NoticiaService noticiaService, CategoriaService categoriaService) {
        this.noticiaService = noticiaService;
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ModelAndView view() {
        ModelAndView mv = new ModelAndView("noticias");
        return mv;
    }
}
