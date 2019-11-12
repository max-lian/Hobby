package com.company.runtimeTests;

import com.company.Hobby;
import com.company.Hobbyes.Football;
import com.company.enums.Complexity;

import java.util.HashMap;

public class HashMapTests {

    public static HashMap<Hobby, Integer> createHashMap(){
        HashMap<Hobby, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < 10000; i++) {
            hashMap.put(new Football("f" + i % 127 + "g" + i % 133, Complexity.HARD, 10 + i), i);
        }
        //System.out.println(hashMap.size());
        return hashMap;
    }

    public static void deleteHashMap(HashMap hashMap){
        for(int i = 0; i < 10000; i++){
            hashMap.remove(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }

    public static void getHashMap(HashMap hashMap){
        for(int i = 0; i < 10000; i++){
            hashMap.get(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }
}
