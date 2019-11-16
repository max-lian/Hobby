package com.company.runtimeTests;

import com.company.Hobby;
import com.company.Hobbyes.Football;
import com.company.enums.Complexity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.company.MenuScript.ELEMENT_SIZE;

public class LinkedListTests {
    static public List<Hobby> createLinkedList(){
        List <Hobby> list = new LinkedList<Hobby>();
        for(int i = 0; i < ELEMENT_SIZE; i++) {
            list.add(new Football("f" + i % 127 + "g" + i % 133, Complexity.HARD, 10 + i));
        }
        return list;
    }

    static public void deleteLinkedList(List list){
        for(int i = 0; i < ELEMENT_SIZE; i++){
            list.remove(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }

    static public void getAllLinkedList(List list) {
        for(int i = 0; i < ELEMENT_SIZE; i++){
            list.get(i);
        }
    }
}
