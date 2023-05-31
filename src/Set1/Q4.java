package Set1;
/*
#ArrayList: string literal concatenation
What will be the result of compiling and executing Test class?

package com.cher.certification;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}

Options are :

true:false
null:true (Correct)
NullPointerException is thrown at runtime
true:true
null:null
Answer :null:true

 */
import java.util.ArrayList;
import java.util.List;
public class Q4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }

}


/*
Let's analyze the code:

List<String> list = new ArrayList<>();

This line creates a new ArrayList object named list that can store String elements.
list.add(null);

The add() method is called to add a null value to the list.
list.add(null);

Another null value is added to the list.
list.add(null);

Yet another null value is added to the list.
System.out.println(list.remove(0) + ":" + list.remove(null));

In this line, list.remove(0) removes and returns the element at index 0, which is null.
list.remove(null) attempts to remove the first occurrence of null in the list.
Since there are three occurrences of null in the list, the first occurrence is removed and returned, resulting in true.
The println() statement prints the concatenated string representation of null, :, and true, resulting in null:true.
Therefore, the correct result is:

null:true

 */