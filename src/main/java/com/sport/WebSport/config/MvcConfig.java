package com.sport.WebSport.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/admin/info/add").setViewName("admin");
        registry.addViewController("/login").setViewName("login");
    }
}