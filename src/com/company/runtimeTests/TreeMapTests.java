package com.company.runtimeTests;

import com.company.Hobby;
import com.company.Hobbyes.Football;
import com.company.enums.Complexity;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

import static com.company.MenuScript.ELEMENT_SIZE;

public class TreeMapTests {

    public static TreeMap<Hobby, Integer> createTreeMap(){
        TreeMap<Hobby, Integer> treeMap = new TreeMap<>();
        for(int i = 0; i < ELEMENT_SIZE; i++) {
            treeMap.put(new Football("f" + i % 127 + "g" + i % 133, Complexity.HARD, 10 + i), i);
        }
        //System.out.println(hashMap.size());
        return treeMap;
    }

    public static void deleteTreeMap(TreeMap treeMap){
        for(int i = 0; i < ELEMENT_SIZE; i++){
            treeMap.remove(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }

    public static void getTreeMap(TreeMap treeMap){
        for(int i = 0; i < ELEMENT_SIZE; i++){
            treeMap.get(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }
}

