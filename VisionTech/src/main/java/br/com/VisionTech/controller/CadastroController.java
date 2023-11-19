package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.VisionTech.repository.CadastroRepository;

@Controller
public class CadastroController {
@Autowired
private CadastroRepository cadastroRepository;
	@GetMapping({"/cadastrar"})
public String home(ModelMap model) {
		model.addAttribute("cadastro",cadastroRepository.findAll());
        return "html/cadastro";



}
}