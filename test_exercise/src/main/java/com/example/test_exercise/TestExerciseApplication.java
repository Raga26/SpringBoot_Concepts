package com.example.test_exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLOutput;

@Configuration
@ComponentScan
public class TestExerciseApplication {
    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(TestExerciseApplication.class);
            context.getBean(Runner.class).run();
            System.out.println( context.getBean(DataService.class).findMax());

        }catch (Exception ex){

        }
    }

}
