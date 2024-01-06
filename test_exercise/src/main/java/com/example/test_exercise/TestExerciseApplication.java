package com.example.test_exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class TestExerciseApplication {
    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(TestExerciseApplication.class);

            System.out.println( context.getBean(Calculation.class).max());

        }catch (Exception ex){

        }
    }

}
