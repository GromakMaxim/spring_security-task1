package com.example.sprsec1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().and().authorizeRequests().antMatchers("/hello").permitAll()
                .and()
                .authorizeRequests().anyRequest().authenticated();

        //видимо, h2 имеет свою собственную аутентификацию и блокирует доступ к веб-консоли. Нашёл вот эту конструкцию:
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
