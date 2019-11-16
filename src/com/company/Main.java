package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("");
        Scanner scan = new Scanner(System.in);
        long timeTable[][] = new long[3][3];
        while(true){
            System.out.println("1. ArrayList test");
            System.out.println("2. LinkedList test");
            System.out.println("3. HashMap test");
            System.out.println("4. HashSet test");
            System.out.println("5. TreeMap test");
            System.out.println("6. Statistic");
            System.out.println("7. Exit");
            int instr = scan.nextInt();
            switch (instr){
                case 1:
                    printTime(MenuScript.testsArrayList());
                    break;
                case 2:
                    printTime(MenuScript.testsLinkedList());
                    break;
                case 3:
                    printTime(MenuScript.testHashMap());
                    break;
                case 4:
                    printTime(MenuScript.testsHashSet());
                    break;
                case 5:
                    printTime(MenuScript.testsTreeMap());
                    break;
                case 6:
                    MenuScript.printStatistic();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void printTime(long[] a){
        System.out.println("Time to create 100000 objects: " +  a[0] + " ms;");
        System.out.println("Time to get 100000 objects: " +  a[1] + " ms;");
        System.out.println("Time to delete 100000 objects: " +  a[2] + " ms;");
    }
}
