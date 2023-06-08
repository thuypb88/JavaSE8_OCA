package Set1;

/*
What will be the result of compiling and executing Test class?

package com.cher.certification;

public class Test {

     private static void add(double d1, double d2) {
         System.out.println("double version: " + (d1 + d2));
     }

     private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
     }

     public static void main(String[] args) {
         add(10.0, null);
     }

}

Options are :

An exception is thrown at runtime (Correct)
Compilation error
double version: 10.0
Double version: 10.0
Answer :An exception is thrown at runtime
 */

public class Q_18 {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
       // Q_18 obj = new Q_18();
       // obj.add(10.0, null);
        add(10.0, null);
    }
}
/*
This exception occurs because you are trying to perform an addition operation (d1 + d2) with a null value (d2). Since null is not a valid value for either a double or Double type, a NullPointerException is thrown.
 */