package practiceTest2;
import java.util.function.Predicate;

/*
What will be the result of compiling and executing Test class?

package com.cher.certification;

import java.util.function.Predicate;

public class Test {
     public static void main(String[] args) {
         String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

       processStringArray(arr, p);
     }

     private static void processStringArray(String [] arr,
                                                Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}
    Display all strings
  processStringArray(arr, p -> !false);
  processStringArray(arr, p -> p.length() < 10);
  processStringArray(arr, p -> p.length() >= 1);
  processStringArray(arr, p -> true);
}*/
public class Question_03 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
      //Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A");

       //processStringArray(arr, p -> !false);
       // processStringArray(arr, p -> p.length() < 10);
        //processStringArray(arr, p -> p.length() >= 1);
        processStringArray(arr, p -> true);

    }
    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
