package com.company;

import com.company.runtimeTests.*;

import java.util.*;

import static com.company.runtimeTests.HashMapTests.createHashMap;

public class MenuScript {
    public static final int ELEMENT_SIZE = 40000;

    static long[] testsArrayList(){
        long[] resTime = new long[3];
        long startTime = System.currentTimeMillis();
        ArrayList arrayList = (ArrayList) ArrayListTests.createArrayList();
        long stopTime = System.currentTimeMillis();
        resTime[0] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        ArrayListTests.getAllArrayList(arrayList);
        stopTime = System.currentTimeMillis();
        resTime[1] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        ArrayListTests.deleteArrayList(arrayList);
        stopTime = System.currentTimeMillis();
        resTime[2] = stopTime - startTime;
        arrayList = null;
        return resTime;
    }

    static long[] testsLinkedList(){
        long resTime[] = new long[3];
        long startTime = System.currentTimeMillis();
        LinkedList<Hobby> linkedList = (LinkedList<Hobby>) LinkedListTests.createLinkedList();
        long stopTime = System.currentTimeMillis();
        resTime[0] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        LinkedListTests.getAllLinkedList(linkedList);
        stopTime = System.currentTimeMillis();
        resTime[1] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        LinkedListTests.deleteLinkedList(linkedList);
        stopTime = System.currentTimeMillis();
        resTime[2] = stopTime - startTime;
        linkedList = null;
        return resTime;
    }

    static long[] testsHashSet(){
        long resTime[] = new long[3];
        long startTime = System.currentTimeMillis();
        HashSet<Hobby> hashSet = HashSetTests.createHashSet();
        long stopTime = System.currentTimeMillis();
        resTime[0] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        HashSetTests.getHashSet(hashSet);
        stopTime = System.currentTimeMillis();
        resTime[1] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        HashSetTests.deleteHashSet(hashSet);
        stopTime = System.currentTimeMillis();
        resTime[2] = stopTime - startTime;
        hashSet = null;
        return resTime;
    }

    static long[] testHashMap(){
        long resTime[] = new long[3];
        long startTime = System.currentTimeMillis();
        HashMap<Hobby, Integer> hashMap = HashMapTests.createHashMap();
        long stopTime = System.currentTimeMillis();
        resTime[0] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        HashMapTests.getHashMap(hashMap);
        stopTime = System.currentTimeMillis();
        resTime[1] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        HashMapTests.deleteHashMap(hashMap);
        stopTime = System.currentTimeMillis();
        resTime[2] = stopTime - startTime;
        hashMap = null;
        return resTime;
    }

    static long[] testsTreeMap(){
        long resTime[] = new long[3];
        long startTime = System.currentTimeMillis();
        TreeMap<Hobby, Integer> treeMap = TreeMapTests.createTreeMap();
        long stopTime = System.currentTimeMillis();
        resTime[0] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        TreeMapTests.getTreeMap(treeMap);
        stopTime = System.currentTimeMillis();
        resTime[1] = stopTime - startTime;
        startTime = System.currentTimeMillis();
        TreeMapTests.deleteTreeMap(treeMap);
        stopTime = System.currentTimeMillis();
        resTime[2] = stopTime - startTime;
        treeMap = null;
        return resTime;
    }

    static void printStatistic(){
        System.out.println("  Name        create     get    delete   ");
       for(int i = 0; i <= 40; i++){
           System.out.print("-");
       }
        System.out.println();
       long[] a = testsArrayList();
        System.out.printf("| ArrayList |%8d|%8d|%8d|", a[0], a[1], a[2]);
        System.out.println();
        a = testsLinkedList();
        System.out.printf("| LinkedList|%8d|%8d|%8d|", a[0], a[1], a[2]);
        System.out.println();
        a = testsHashSet();
        System.out.printf("|  HashSet  |%8d|%8d|%8d|", a[0], a[1], a[2]);
        System.out.println();
        a = testHashMap();
        System.out.printf("|  HashMap  |%8d|%8d|%8d|", a[0], a[1], a[2]);
        System.out.println();
        a = testsTreeMap();
        System.out.printf("|  TreeMap  |%8d|%8d|%8d|", a[0], a[1], a[2]);
        System.out.println();
    }
}
