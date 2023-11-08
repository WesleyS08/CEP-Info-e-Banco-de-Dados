package com.ProjetoP2.Projeto.P2.Controller;

import com.ProjetoP2.Projeto.P2.Service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final CepService cepService;

    @Autowired
    public HomeController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/")
    public String homeSite(){
        return "home";
    }

}