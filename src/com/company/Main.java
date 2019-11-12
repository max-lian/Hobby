package com.company;
import com.company.Hobbyes.Fishing;
import com.company.Hobbyes.Football;
import com.company.enums.*;

import java.util.List;
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
            System.out.println("3. HashSet test");
            System.out.println("4. Statistic");
            System.out.println("5. Exit");
            int instr = scan.nextInt();
            switch (instr){
                case 1:
                    MenuScript.testsArrayList();
                    break;
                case 2:
                    MenuScript.testsLinkedList();
                    break;
                case 3:
                    MenuScript.testHashMap();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}
