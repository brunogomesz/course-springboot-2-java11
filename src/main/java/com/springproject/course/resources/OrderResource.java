package com.springproject.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.course.entities.Order;
import com.springproject.course.services.OrderService;

//Resources - recursos da aplicação

@RestController // Anotation para dizer que o recurso web é implementado por um controlador REST
@RequestMapping(value = "/orders")  // Da o nome para o recurso
public class OrderResource {
	
	@Autowired // Para que o Spring já faça a omjeção de dependencia
	private OrderService service;
	
	@GetMapping // Anotation para indicar que esse método responde a requisição do tipo get do http
	public ResponseEntity<List<Order>> findAll() { // Método que vai ser um endpoint para acessar os usuários
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //Parametro que pega o valor pelo id
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
