package com.fiap.com.br.sorteio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
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
