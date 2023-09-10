package com.desafio.devmedia.controller;

import com.desafio.devmedia.model.Categoria;
import com.desafio.devmedia.services.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
        mv.addObject("categorias", categoriaService.listar());
        return mv;
    }

    @PostMapping
    public ModelAndView cadastrar(@Valid Categoria categoria, BindingResult result) {
        ModelAndView mv = new ModelAndView("categoria");

        if (result.hasErrors()) {
            mv.addObject("erros", result.getAllErrors());
            return mv;
        }

        categoriaService.salvar(categoria);
        return new ModelAndView("redirect:/noticias");
    }

}
