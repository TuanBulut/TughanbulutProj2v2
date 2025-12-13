package com.vistulaproject2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Products Api for Vistula",version = "1.0",description = "Products Information"))
public class VistulaProject2Application {

    public static void main(String[] args) {
        SpringApplication.run(VistulaProject2Application.class, args);
    }

}
