package com.ProjetoP2.Projeto.P2.Service;

import com.ProjetoP2.Projeto.P2.Models.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    public User obterCEP(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://viacep.com.br/ws/" + cep + "/json/";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                return mapper.readValue(response.getBody(), User.class);
            } catch (Exception e) {
                e.printStackTrace(); // Trate ou registre a exceção conforme necessário
            }
        }

        return null;
    }
}