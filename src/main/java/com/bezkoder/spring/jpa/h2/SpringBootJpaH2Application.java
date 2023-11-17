package com.bezkoder.spring.jpa.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaH2Application.class, args);
    }

}

/*
 * https://www.bezkoder.com/spring-boot-jpa-h2-example code
 * https://github.com/bezkoder/spring-boot-h2-database-crud simpler:(noservice):
 * entity, repository, controller(repository) ja te ResponseEntity per
 * HttpStatus.OK, etc. Postman
 * 
 * http://localhost:8080/h2-ui/ : http://localhost:8080/api/tutorials :
 * 
 * Whitelabel Error Page This application has no explicit mapping for /error, so
 * you are seeing this as a fallback.
 * 
 * Thu Mar 30 21:45:16 CEST 2023 There was an unexpected error (type=Not Found,
 * status=404).
 * 
 * [ { "id": 1, "title": "China study", "description": "desc", "published": true
 * }, { "id": 2, "title": "England study", "description": "desc", "published":
 * false }, { "id": 3, "title": "Scotland study mod", "description": "ss",
 * "published": true }, { "id": 4, "title": "Wales study", "description":
 * "desc", "published": false }, { "id": 5, "title": "Sccotland study",
 * "description": "desc", "published": false } ]
 * 
 */