package com.epam.rd.autotasks.library.config;

import com.epam.rd.autotasks.library.Author;
import com.epam.rd.autotasks.library.Book;
import com.epam.rd.autotasks.library.Publisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AuthorConfig.class, PublisherConfig.class})
public class BookConfig {

    @Bean
    public Book printBook(Author author, Publisher publisher) {
        return new Book(
                "The Adventures of Spring (Print Edition)",
                author,
                publisher,
                "Print"
        );
    }

    @Bean
    public Book ebook(Author author, Publisher publisher) {
        return new Book(
                "The Adventures of Spring (E-book Edition)",
                author,
                publisher,
                "E-book"
        );
    }
}