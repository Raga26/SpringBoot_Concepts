package com.example.test_exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataService implements DataService{

    public int[] retrieveData(){

        return  new int[] {12 , 7 , 94 , 78} ;
    }

    public int findMax(){
        return 7;
    }
}
