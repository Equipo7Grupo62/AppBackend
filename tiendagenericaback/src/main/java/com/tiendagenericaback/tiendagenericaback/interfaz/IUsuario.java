package com.tiendagenericaback.tiendagenericaback.interfaz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.tiendagenericaback.tiendagenericaback.modelo.Usuario;

@Service
public interface IUsuario extends CrudRepository<Usuario, Integer>{

}
