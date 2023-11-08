package com.ProjetoP2.Projeto.P2.Controller;

import com.ProjetoP2.Projeto.P2.Models.User;
import com.ProjetoP2.Projeto.P2.Repository.UserRepository;
import com.ProjetoP2.Projeto.P2.Service.CepService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CepController {
    private final CepService cepService;
    private final UserRepository userRepository;

    public CepController(CepService cepService, UserRepository userRepository) {
        this.cepService = cepService;
        this.userRepository = userRepository;
    }

    @GetMapping("/buscarcep")
    public String exibirBuscador() {
        return "formBuscaCep";
    }

    @PostMapping("/buscarcep")
    public String buscarCep(@RequestParam("cep") String cep, Model model) {
        User informacoesCep = cepService.obterCEP(cep);
        if (informacoesCep != null) {
            User user = new User();
            user.setCep(informacoesCep.getCep());
            user.setLogradouro(informacoesCep.getLogradouro());
            user.setComplemento(informacoesCep.getComplemento());
            user.setBairro(informacoesCep.getBairro());
            user.setLocalidade(informacoesCep.getLocalidade());
            user.setUf(informacoesCep.getUf());
            user.setIbge(informacoesCep.getIbge());
            user.setGia(informacoesCep.getGia());
            user.setDdd(informacoesCep.getDdd());
            user.setSiafi(informacoesCep.getSiafi());
            // Defina os outros campos da entidade 'User' conforme a resposta do ViaCEP

            // Salvar no banco de dados
            userRepository.save(informacoesCep);
        }
        model.addAttribute("resultado", informacoesCep);
        return "resultado";
    }
}
