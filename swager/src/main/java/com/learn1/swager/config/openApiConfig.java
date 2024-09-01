package com.learn1.swager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class openApiConfig{

  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Test Swagger project")
            .version("0.0.1")
            .description("Test Swagger implantation Description")
            .license(new License()
                .name("Open API License")
                .url("https://gunatheeban.com"))
            .summary("Test Swagger implantation Summery")
            .contact(new Contact()
                .name("Gunatheeban")
                .email("gunatheeban@gmail.com")
                .url("https://gunatheeban.com"))
        )
        .servers(List.of(new Server().description("Dev Server").url("http://localhost:8089/")));
  }
}
