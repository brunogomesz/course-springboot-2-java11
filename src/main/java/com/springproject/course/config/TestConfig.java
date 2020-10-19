package com.springproject.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springproject.course.entities.User;
import com.springproject.course.repositories.UserRepository;

@Configuration // Anotation - Fala para o spring que essa classe é específica para configuração
@Profile("test") //Configuração específica para o perfil de teste
public class TestConfig implements CommandLineRunner {

	@Autowired // Associa uma instancia do UserRepository no TestConfig
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
