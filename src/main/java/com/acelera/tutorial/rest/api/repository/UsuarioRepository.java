package com.acelera.tutorial.rest.api.repository;

import com.acelera.tutorial.rest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
