package com.epam.rd.autotasks.library.config;

import com.epam.rd.autotasks.library.Author;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AuthorConfig {

    @Bean
    public Author author() { // this type of constructor must be present in Author class
        return new Author("John Doe");
    }

    // For this to compile, your Author class must have a no-argument constructor:
    // names do not necessarily have to match

    @Bean
    public Author anonymousAuthor() { // this type of constructor must be present in Author class
        return new Author();
    }

}