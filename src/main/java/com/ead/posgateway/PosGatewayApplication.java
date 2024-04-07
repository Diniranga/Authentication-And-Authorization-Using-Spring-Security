package com.ead.posgateway;

import com.ead.posgateway.Auth.AuthenticationService;
import com.ead.posgateway.Auth.RegisterRequest;
import com.ead.posgateway.User.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PosGatewayApplication {

    public static void main(String[] args) {

        SpringApplication.run(PosGatewayApplication.class, args);
    }
    
//    @Bean
//    public CommandLineRunner commandLineRunner(
//            AuthenticationService service
//    ) {
//        return args -> {
//            var admin = RegisterRequest.builder()
//                    .firstName("admin")
//                    .lastName("Admin")
//                    .email("admin@gmail.com")
//                    .password("root")
//                    .role(ADMIN)
//                    .build();
//            System.out.println("Admin token: "+ service.register(admin).getAccessToken());
//
//        };
//
//    }

}
