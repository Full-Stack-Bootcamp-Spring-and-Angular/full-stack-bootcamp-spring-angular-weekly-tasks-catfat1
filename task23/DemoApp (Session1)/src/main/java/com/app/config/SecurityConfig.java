package com.app.config;





import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(users.username("Heba").password("123").roles("ADMIN"))
                .withUser(users.username("Hamza").password("123").roles("SYSTEM"))
                .withUser(users.username("Joumana").password("123").roles("MANAGER"))
                ;

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/showAdminPage").hasRole("ADMIN")
                .antMatchers("/showSystemPage").hasRole("SYSTEM")
                .antMatchers("/showManagerPage").hasRole("MANAGER")

                .anyRequest().authenticated()
                .and()
                .formLogin()
                .defaultSuccessUrl("/",true)
                .permitAll();

    }
}


