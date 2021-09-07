package com.tiendagenericaback.tiendagenericaback.interfaceservices;

import java.util.List;
import java.util.Optional;

import com.tiendagenericaback.tiendagenericaback.modelo.Usuario;

public interface IUsuarioService {
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int Id);
	public int save(Usuario u);
	public void delete(int Id);

}
