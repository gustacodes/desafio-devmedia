package com.desafio.devmedia.controller;

import com.desafio.devmedia.model.Categoria;
import com.desafio.devmedia.model.Noticias;
import com.desafio.devmedia.services.CategoriaService;
import com.desafio.devmedia.services.NoticiaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class NoticiasController {

    private NoticiaService noticiaService;
    private CategoriaService categoriaService;

    public NoticiasController(NoticiaService noticiaService, CategoriaService categoriaService) {
        this.noticiaService = noticiaService;
        this.categoriaService = categoriaService;
    }

    @GetMapping("/noticias")
    public ModelAndView view(Noticias noticias) {
        ModelAndView mv = new ModelAndView("noticias");
        mv.addObject("noticias", noticias);
        mv.addObject("categorias", categoriaService.listar());
        return mv;
    }

    @PostMapping("/noticias")
    public ModelAndView cadastrar(@Valid Noticias noticias, BindingResult result                                  ,
                                   @RequestParam(value = "categoria", required = false) String categoriaSelecionada) {
        ModelAndView mv = new ModelAndView("noticias");

        Categoria categoria = categoriaService.nome(categoriaSelecionada);
        noticias.setCategoria(categoria);

        if (result.hasErrors()) {
            mv.addObject("errors", result.getAllErrors());
            mv.addObject("categorias", categoriaService.listar());
            return mv;
        }

        noticiaService.save(noticias);
        return new ModelAndView("redirect:/lista-noticias");
    }

    @GetMapping("/lista-noticias")
    public ModelAndView lista(@RequestParam(value = "busca", required = false) String busca) {
        ModelAndView mv = new ModelAndView("lista-noticias");
        if (busca != null) {
            mv.addObject("todas", noticiaService.buscarPorNome(busca));
        } else {
            mv.addObject("todas", noticiaService.listar());
        }

        return mv;
    }

}
