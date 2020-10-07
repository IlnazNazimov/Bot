package ru.innopolis.stc27.maslakov.enterprise.project42;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class Project42Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(Project42Application.class, args);
    }

}
