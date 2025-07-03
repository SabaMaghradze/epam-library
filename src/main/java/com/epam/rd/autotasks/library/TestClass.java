package com.epam.rd.autotasks.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.epam.rd.autotasks.library");
        TestClass testClass = context.getBean(TestClass.class);

        testClass.printAuthor();
        testClass.printAnonAuthor();

        testClass.setNameForAnon("Gustavo Fring");
        testClass.printAnonAuthor();
    }

    @Autowired
    private Author author;

    @Autowired
    @Qualifier("anonymousAuthor")
    private Author anonAuthor;

    public void printAuthor() {
        System.out.println(author.getName());
    }

    public void printAnonAuthor() {
        if (anonAuthor.getName() == null || anonAuthor.getName().isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(anonAuthor.getName());
        }
    }

    public void changeName(String name) {
        author.setName(name);
    }

    public void setNameForAnon(String name) {
        anonAuthor.setName(name);
    }
}
