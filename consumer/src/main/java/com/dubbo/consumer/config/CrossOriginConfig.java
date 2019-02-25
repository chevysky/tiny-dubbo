package com.dubbo.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CrossOriginConfig {

    private CorsConfiguration crossDomain(){
        CorsConfiguration cors = new CorsConfiguration();
        //允许所有的域名
        cors.addAllowedOrigin("*");
        //允许任何头
        cors.addAllowedHeader("*");
        //允许任何方法post/get等
        cors.addAllowedMethod("*");
        return cors;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", crossDomain());
        return new CorsFilter(source);
    }
}
