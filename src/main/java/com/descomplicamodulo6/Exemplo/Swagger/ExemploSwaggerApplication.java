package com.descomplicamodulo6.Exemplo.Swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Exemplo Swagger", version = "1.0", description = "Exemplo de uso do Swagger")

)
@SpringBootApplication
public class ExemploSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploSwaggerApplication.class, args);
	}

}
