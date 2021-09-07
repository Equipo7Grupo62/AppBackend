package com.tiendagenericaback.tiendagenericaback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendagenericaback.tiendagenericaback.interfaceservices.IUsuarioService;
import com.tiendagenericaback.tiendagenericaback.interfaz.IUsuario;
import com.tiendagenericaback.tiendagenericaback.modelo.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuario data;

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int Id) {
		// TODO Auto-generated method stub
		
	}

}
