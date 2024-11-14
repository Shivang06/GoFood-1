//package com.example.me.gofood1.Config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                // Disabling CSRF protection explicitly
//               // .securityContext().csrf().disable()  // For Spring Security 6.1+
//
//                // Configuring request authorization
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/login", "/signup", "/css/**", "/js/**").permitAll() // Public endpoints
//                        .anyRequest().authenticated() // Require authentication for all other requests
//                )
//
//                // Login configuration
//                .formLogin(form -> form
//                        .loginPage("/login") // Custom login page
//                        .defaultSuccessUrl("/home", true) // Redirect to home after successful login
//                        .permitAll() // Allow unauthenticated users to access the login page
//                )
//
//                // Logout configuration
//                .logout(logout -> logout
//                        .permitAll() // Allow unauthenticated users to logout
//                );
//
//        return http.build(); // Return the security filter chain
//    }
//
//    // Define PasswordEncoder as a bean
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
//
//
