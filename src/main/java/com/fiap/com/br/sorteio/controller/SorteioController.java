package com.fiap.com.br.sorteio.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.com.br.sorteio.model.NumeroSorteio;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/dado")
public class SorteioController {
  private final Random random = new Random();

  @GetMapping
  @Operation(
    summary = "API para sortear um número entre 1 e 6"
  )
  public NumeroSorteio sortearNumero() {
    int numero = random.nextInt(6) + 1;
    return new NumeroSorteio(numero);
  }

  @GetMapping("/{maximo}")
  @Operation(
    summary = "API para sortear um número entre 1 e o parâmetro {maximo}"
  )
  public NumeroSorteio sortearNumeroPersonalizado(@PathVariable int maximo) {
    int numero = random.nextInt(maximo) + 1;
    return new NumeroSorteio(numero);
  }
}
