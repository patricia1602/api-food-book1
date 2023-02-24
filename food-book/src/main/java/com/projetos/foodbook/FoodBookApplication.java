package com.projetos.foodbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projetos.foodbook.model.Usuario;
import com.projetos.foodbook.repository.UsuarioRepository;

@SpringBootApplication
public class FoodBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodBookApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(UsuarioRepository usuarioRepository) {
        return args -> {
           usuarioRepository.deleteAll();
             
		   Usuario u = new Usuario();
		   u.setUsuario("Patricia");
		   u.setCategoria("Bolo");

		       usuarioRepository.save(u)  ;
		};
	}
}
