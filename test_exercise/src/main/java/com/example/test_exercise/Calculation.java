package com.example.test_exercise;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class Calculation {

    private DataService data;

    public Calculation(DataService data){
        super();
        this.data = data;
    }


    public int max(){
      return Arrays.stream(data.retrieveData()).max().orElse(0);
    }
}
