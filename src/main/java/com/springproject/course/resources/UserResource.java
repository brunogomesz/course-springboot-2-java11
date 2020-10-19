package com.springproject.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.course.entities.User;

//Resources - recursos da aplicação

@RestController // Anotation para dizer que o recurso web é implementado por um controlador REST
@RequestMapping(value = "/users")  // Da o nome para o recurso
public class UserResource {

	@GetMapping // Anotation para indicar que esse método responde a requisição do tipo get do http
	public ResponseEntity<User> findAll() { // Método que vai ser um endpoint para acessar os usuários
		User u = new User(1L, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		return ResponseEntity.ok().body(u);
	}
}
