package com.example.test_exercise;

import org.springframework.stereotype.Component;

@Component
public class Runner {

    private DataService data;

    public Runner (DataService data){
        this.data = data;
    }

    public void run(){
        System.out.println("Running data: " + data);
        data.retrieveData();
        data.findMax();
    }
}
