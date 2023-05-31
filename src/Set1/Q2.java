package Set1;
/*
#flow control: switch statements

What will be the result of compiling and executing Test class?

package com.cher.certification;

public class Test {
     public static void main(String[] args) {
         String fruit = "mango";
         switch (fruit) {
             case "Apple":
                 System.out.println("APPLE");
             case "Mango":
                 System.out.println("MANGO");
             case "Banana":
                 System.out.println("BANANA");
                 break;
             default:
                 System.out.println("ANY FRUIT WILL DO");
         }
     }
}

Options are :

MANGO ANY FRUIT WILL DO
MANGO
ANY FRUIT WILL DO (Correct)
MANGO BANANA
MANGO BANANA ANY FRUIT WILL DO
Answer :ANY FRUIT WILL DO
 */
public class Q2 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }

}