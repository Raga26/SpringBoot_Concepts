package com.example.test_exercise;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService{

    public int[] retrieveData(){

        return  new int[] {12 , 7 , 94} ;
    }

}
