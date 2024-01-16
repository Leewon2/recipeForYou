//package com.recipeForYou.backend.global.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authz -> authz
//                        .antMatchers("/login/**", "/error", "/css/**", "/js/**").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .oauth2Login(oauth2 -> oauth2
//                        .loginPage("/login")
//                        .userInfoEndpoint()
//                        .userService(oauth2UserService())
//                );
//
//        return http.build();
//    }
//
//    @Bean
//    public OAuth2UserService<OAuth2UserRequest, OAuth2User> oauth2UserService() {
//        DefaultOAuth2UserService delegate = new DefaultOAuth2UserService();
//        return (request) -> {
//            OAuth2User oAuth2User = delegate.loadUser(request);
//            return oAuth2User;
//        };
//    }
//}
//
