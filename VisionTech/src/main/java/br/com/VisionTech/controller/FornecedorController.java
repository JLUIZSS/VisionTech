package br.com.VisionTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.VisionTech.repository.FornecedorRepository;

@Controller
public class FornecedorController {
@Autowired
private FornecedorRepository fornecedorRepository;
	@GetMapping({"/fornecedor"})
public String home(ModelMap model) {
		model.addAttribute("fornecedor",fornecedorRepository.findAll());
         return "html/fornecedor";


	}
}
