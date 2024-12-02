package com.example.xssdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentController {

    private final List<String> comentarios = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("comentarios", comentarios);
        return "index";
    }

    @PostMapping("/adicionarComentario")
    public String adicionarComentario(@RequestParam String comentario) {
        comentarios.add(comentario); // Armazena sem sanitização
        return "redirect:/";
    }
}
