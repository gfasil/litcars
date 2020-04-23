package com.dockerexample.litcars.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class OktaOAuth2WebSecurityConfigurerAdapter  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/api/v1/cars/**").authenticated().and()
                .oauth2ResourceServer().jwt();
        http.cors();
    }
}
