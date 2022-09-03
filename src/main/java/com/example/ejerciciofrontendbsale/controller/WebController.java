package com.example.ejerciciofrontendbsale.controller;

import com.example.ejerciciofrontendbsale.restTemplate.RestTemplateProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Clase controladora encargada de recibir y responder peticiones HTTP.
 */
@Controller
public class WebController {

    @GetMapping("/")
    public String inicio(Model model) {
        RestTemplateProvider restTemplateProvider = new RestTemplateProvider();
        model.addAttribute("categoriaActual", -1);
        model.addAttribute("categorias", restTemplateProvider.categoriasDesdeApi());
        model.addAttribute("productos", restTemplateProvider.productosDesdeApi());
        return "/index";
    }

    @GetMapping("/categoria/{id}")
    public String filtroPorCategoria(Model model, @PathVariable int id) {
        RestTemplateProvider restTemplateProvider = new RestTemplateProvider();
        model.addAttribute("categoriaActual", id);
        model.addAttribute("categorias", restTemplateProvider.categoriasDesdeApi());
        model.addAttribute("productos", restTemplateProvider.productosPorCategoriaDesdeApi(id));
        return "/index";
    }

    @PostMapping("/buscar")
    public String filtroPorNombre(@RequestParam("campoBusqueda") String texto, Model model) {
        RestTemplateProvider restTemplateProvider = new RestTemplateProvider();
        if (texto.isBlank()) {
            return "redirect:/";
        } else {
            model.addAttribute("categoriaActual", -1);
            model.addAttribute("categorias", restTemplateProvider.categoriasDesdeApi());
            model.addAttribute("productos", restTemplateProvider.productosPorNombreDesdeApi(texto));
            model.addAttribute("busquedaAnterior", texto);
            return "/index";
        }
    }
}
