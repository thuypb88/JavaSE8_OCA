package Set1;
/*
#ArrayLists
Consider below code:

//Test.java
package com.cher.certification;

import java.util.ArrayList;
import java.util.List;

public class Test {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add(0, "Array");
         list.add(0, "List");

         System.out.println(list);
     }
}
What will be the result of compiling and executing Test class?


Options are :

[Array, List]
[List, Array] (Correct)
[List]
[Array]
An exception is thrown at runtime
Answer :[List, Array]

 */
import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");

        System.out.println(list);
    }

}


/*
Let's analyze the code:

List<String> list = new ArrayList<>();

This line creates a new ArrayList object named list that can store String elements.
list.add(0, "Array");

The add() method is called to insert the string "Array" at index 0 in the list. This shifts any existing elements to the right.
list.add(0, "List");

The add() method is called again to insert the string "List" at index 0 in the list. This shifts the previously inserted element ("Array") to index 1 and any other existing elements to the right.
System.out.println(list);

This line prints the content of the list using the println() method. The ArrayList class overrides the toString() method to provide a string representation of its elements.
[List, Array]

The elements in the list are printed in the order they were inserted, so "List" is at index 0 and "Array" is at index 1.
 */