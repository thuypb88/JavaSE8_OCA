package simulationSet01;
/*
Given code:
package com.cher.certification;
 public class Test {
    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        for(/INSERT/) {
        if (n % 2 == 0) {
        continue;
        }
        System.out.print(arr[n]); //Line n1
        }
        }
        }


        And below options:

        1. int n = 0; n < arr.length; n += 1

        2. int n = 0; n <= arr.length; n += 1

        3. int n = 1; n < arr.length; n += 2

        4. int n = 1; n <= arr.length; n += 2
        How many above options can be used to replace /INSERT/, such that on execution, code will print NET on to the console?


        Options are :

        None of the other options
        All four options (Correct)
        Only three options
        Only two options
        Only one option
        Answer :All four options
 */

public class Q5 {
    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
       // for(int n = 0; n < arr.length; n += 1) {
       //for(int n = 0; n <= arr.length; n += 1) {
          // for(int n = 1; n < arr.length; n += 2) {
        for(int n = 1; n <= arr.length; n += 2) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(arr[n]); //Line n1
        }
    }
}
