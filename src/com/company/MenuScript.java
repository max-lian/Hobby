package com.company;

import com.company.runtimeTests.ArrayListTests;
import com.company.runtimeTests.HashMapTests;
import com.company.runtimeTests.LinkedListTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import static com.company.runtimeTests.HashMapTests.createHashMap;

public class MenuScript {

    static void testsArrayList(){
        long startTime = System.currentTimeMillis();
        ArrayList arrayList = (ArrayList) ArrayListTests.createArrayList();
        long stopTime = System.currentTimeMillis();
        System.out.println("Time to create 10000 objects: " +  (stopTime - startTime) + " ms;");
        startTime = System.currentTimeMillis();
        ArrayListTests.getAllArrayList(arrayList);
        stopTime = System.currentTimeMillis();
        System.out.println("Time to get 10000 objects: " +  (stopTime - startTime) + " ms;");
        startTime = System.currentTimeMillis();
        ArrayListTests.deleteArrayList(arrayList);
        stopTime = System.currentTimeMillis();
        System.out.println("Time to delete 10000 objects: " +  (stopTime - startTime) + " ms;");
    }

    static void testsLinkedList(){
        long startTime = System.currentTimeMillis();
        LinkedList<Hobby> linkedList = (LinkedList<Hobby>) LinkedListTests.createLinkedList();
        long stopTime = System.currentTimeMillis();
        System.out.println("Time to create 10000 objects: " +  (stopTime - startTime) + " ms;");
        startTime = System.currentTimeMillis();
        LinkedListTests.getAllLinkedList(linkedList);
        stopTime = System.currentTimeMillis();
        System.out.println("Time to get 10000 objects: " +  (stopTime - startTime) + " ms;");
        startTime = System.currentTimeMillis();
        LinkedListTests.deleteLinkedList(linkedList);
        stopTime = System.currentTimeMillis();
        System.out.println("Time to delete 10000 objects: " +  (stopTime - startTime) + " ms;");
    }

    static void testsHashSet(){

    }

    static void testHashMap(){
        long startTime = System.currentTimeMillis();
        HashMap<Hobby, Integer> hashMap = HashMapTests.createHashMap();
        long stopTime = System.currentTimeMillis();
        System.out.println("Time to create 10000 objects: " +  (stopTime - startTime) + " ms;");
        startTime = System.currentTimeMillis();
        HashMapTests.getHashMap(hashMap);
        stopTime = System.currentTimeMillis();
        System.out.println("Time to get 10000 objects: " +  (stopTime - startTime) + " ms;");
        startTime = System.currentTimeMillis();
        HashMapTests.deleteHashMap(hashMap);
        stopTime = System.currentTimeMillis();
        System.out.println("Time to delete 10000 objects: " +  (stopTime - startTime) + " ms;");
    }

    static void printStatistic(){

    }
}
