package com.descomplicamodulo6.Exemplo.Swagger.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${app.environment.base-path}")
public class HealthCheckController {

    @GetMapping("${app.environment.health-check}")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Serviço está em execução!");
    }

}
