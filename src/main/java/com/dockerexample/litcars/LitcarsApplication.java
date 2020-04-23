package com.dockerexample.litcars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableOAuth2Client
public class LitcarsApplication {

    public String welcomeUser(Principal principal){
        return "hello" + principal.getName() + "welcome to fayaman";
    }
    public static void main(String[] args) {
        SpringApplication.run(LitcarsApplication.class, args);
    }
//    @Configuration
//    static class OktaOAuth2WebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.authorizeRequests().anyRequest().permitAll();
//        }
//    }

}
