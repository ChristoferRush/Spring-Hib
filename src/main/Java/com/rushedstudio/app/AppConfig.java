package com.rushedstudio.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.rushedstudio.app")
@EnableJpaRepositories(basePackages = "com.rushedstudio.app.repository")
public class AppConfig {

    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactoryBean(){
        LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
        emfb.setPersistenceUnitName("booksPersistenceUnit");
        return emfb;
    }
}
