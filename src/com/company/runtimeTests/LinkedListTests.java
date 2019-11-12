package com.company.runtimeTests;

import com.company.Hobby;
import com.company.Hobbyes.Football;
import com.company.enums.Complexity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTests {
    static public List<Hobby> createLinkedList(){
        List <Hobby> list = new LinkedList<Hobby>();
        for(int i = 0; i < 10000; i++) {
            list.add(new Football("f" + i % 127 + "g" + i % 133, Complexity.HARD, 10 + i));
        }
        return list;
    }

    static public void deleteLinkedList(List list){
        for(int i = 0; i < 10000; i++){
            list.remove(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }

    static public void getAllLinkedList(List list) {
        for(int i = 0; i < 10000; i++){
            list.get(i);
        }
    }
}
