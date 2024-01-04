package com.example.springframeworkgameConsole;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springframeworkgameConsole")
public class AppGaming {

    public static void main(String[] args) {try (var context =
                                                         new AnnotationConfigApplicationContext
                                                                 (AppGaming.class)) {

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();

    }

    }
}
