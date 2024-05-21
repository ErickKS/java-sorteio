package com.fiap.com.br.sorteio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Sorteio API",
		version = "1.0.0",
		description = "API para sortear um número",
		contact = @Contact(name = "Erick Kuwahara", email = "erick@fiap.com.br")
	)
)
public class SorteioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SorteioApplication.class, args);
	}

	@RequestMapping
	@ResponseBody
	public String home(){
		return "FIAP SORTEIO";
	}
}
