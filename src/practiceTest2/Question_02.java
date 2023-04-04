package practiceTest2;
import java.util.function.Predicate;

/*
What will be the result of compiling and executing Test class?

package com.cher.certification;

import java.util.function.Predicate;

public class Test {
     public static void main(String[] args) {
         String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

         Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A");

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

Options are :

A Aa Abab
Runtime exception
Compilation error
ab aba
A ab Aa aba Abab (Correct)
Answer :A ab Aa aba Abab

}*/
public class Question_02 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A");

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
