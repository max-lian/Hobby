package com.company.runtimeTests;

import com.company.Hobby;
import com.company.Hobbyes.Football;
import com.company.enums.Complexity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTests {

    static public List<Hobby> createArrayList(){
        List <Hobby> list = new ArrayList<>(10000);
        for(int i = 0; i < 10000; i++) {
            list.add(new Football("f" + i % 127 + "g" + i % 133, Complexity.HARD, 10 + i));
        }
        return list;
    }

    static public void deleteArrayList(List list){
        for(int i = 0; i < 10000; i++){
            list.remove(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }

    static public void getAllArrayList(List list) {
        for(int i = 0; i < 10000; i++){
            list.get(i);
        }
    }
}
