package com.company.runtimeTests;

import com.company.Hobby;
import com.company.Hobbyes.Football;
import com.company.enums.Complexity;

import java.util.HashMap;
import java.util.HashSet;

import static com.company.MenuScript.ELEMENT_SIZE;

public class HashSetTests {

    public static HashSet<Hobby> createHashSet(){
        HashSet<Hobby> hashSet = new HashSet<Hobby>();
        for(int i = 0; i < ELEMENT_SIZE; i++) {
            hashSet.add(new Football("f" + i % 127 + "g" + i % 133, Complexity.HARD, 10 + i));
        }
        //System.out.println(hashMap.size());
        return hashSet;
    }

    public static void deleteHashSet(HashSet<Hobby> hashSet){
        for(int i = 0; i < ELEMENT_SIZE; i++){
            hashSet.remove(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }

    public static void getHashSet(HashSet<Hobby> hashSet){
        for(int i = 0; i < ELEMENT_SIZE; i++){
            hashSet.contains(new Football("f" + i % 127 + "g" + i % 133 , Complexity.HARD, 10 + i));
        }
    }
}
