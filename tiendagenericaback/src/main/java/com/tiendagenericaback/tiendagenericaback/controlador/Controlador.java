package com.tiendagenericaback.tiendagenericaback.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiendagenericaback.tiendagenericaback.interfaceservices.IUsuarioService;
import com.tiendagenericaback.tiendagenericaback.modelo.Usuario;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/Modulo_Usuarios")
	public String lista(Model model) {
		List<Usuario>usuarios=service.listar();
		model.addAttribute("usuarios", usuarios);
		return "Modulo_Usuarios";
	}

}
