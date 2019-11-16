package com.company.runtimeTests;

import com.company.Hobby;
import com.company.Hobbyes.Football;
import com.company.enums.Complexity;

import java.util.ArrayList;
import java.util.List;

import static com.company.MenuScript.ELEMENT_SIZE;

public class ArrayListTests {

    static public List<Hobby> createArrayList(){
        List <Hobby> list = new ArrayList<>( ELEMENT_SIZE);
        for(int i = 0; i < ELEMENT_SIZE; i++) {
            list.add(new Football("f" + i % 127 + "g" + i % 133, Complexity.HARD, 10 + i));
        }
        return list;
    }

    static public void deleteArrayList(List list){
        for(int i = 0; i < ELEMENT_SIZE; i++){
            list.remove(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }

    static public void getAllArrayList(List list) {
        for(int i = 0; i < ELEMENT_SIZE; i++){
            list.get(i);
        }
    }
}
