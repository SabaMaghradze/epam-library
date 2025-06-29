package com.epam.rd.autotasks.library.config;

import com.epam.rd.autotasks.library.Publisher;
import org.springframework.context.annotation.Bean;

public class PublisherConfig {

    @Bean
    public Publisher publisher() {
        return new Publisher("Spring Publishing House", "123 Spring St.", 2000);
    }

}