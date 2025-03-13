//package com.objectia.JBD_HandsOnLearning.swagger;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import org.springdoc.core.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//    // Bean to configure OpenAPI metadata
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("JBDP API")
//                        .description("API documentation for JBDP")
//                        .version("1.0"));
//    }
//
//    // Bean to configure Swagger UI for the 'public' API group
//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("public")
//                .packagesToScan("com.objectia.JBD_HandsOnLearning")
//                .build();
//    }
//}
