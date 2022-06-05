package org.github.rodrigogb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@Development
public class VendasApplication {

    @Gato
    private Animal animal;

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @Value("${application.name}")
    private String variavel;

    @GetMapping("/hello")
    public String helloWorld() {
        return variavel;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
