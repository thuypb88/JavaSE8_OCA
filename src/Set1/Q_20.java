package Set1;

/*
Consider the code snippet:

import java.util.ArrayList;
import java.util.List;

public class Test {
     List list1 = new ArrayList<String>(); //Line 5
     List<String> list2 = new ArrayList(); //Line 6
     List<> list3 = new ArrayList<String>(); //Line 7
     List<String> list4 = new ArrayList<String>(); //Line 8
     List<String> list5 = new ArrayList<>(); //Line 9
}


Which of the following statements compile without any warning? Select ALL that apply.


Options are :

Line 5
Line 9 (Correct)
Line 7
Line 8 (Correct)
Line 6
Answer :Line 9 Line 8
 */


import java.util.ArrayList;
import java.util.List;

public class Q_20 {

  List list1 = new ArrayList<String>(); //Line 5
    //List<String> list2 = new ArrayList(); //Line 6
    //List<> list3 = new ArrayList<String>(); //Line 7
    //List<String> list4 = new ArrayList<String>(); //Line 8
  // List<String> list5 = new ArrayList<>(); //Line 9
 public static void main(String[] args) {

    }
}
/*
The code snippet provided has a compilation error. Let's analyze each line:

- Line 5: `List list1 = new ArrayList<String>();` - This line does not specify the generic type for the `List`. While it will compile without warning, it will produce an "unchecked" warning due to the absence of the generic type.

- Line 6: `List<String> list2 = new ArrayList();` - This line uses the raw type `ArrayList` without specifying the generic type. It will compile without warning, but it is not recommended to use raw types in Java.

- Line 7: `List<> list3 = new ArrayList<String>();` - This line has a syntax error. It is missing the generic type argument for the diamond operator `<>`.

- Line 8: `List<String> list4 = new ArrayList<String>();` - This line correctly declares a generic `ArrayList` with the generic type `String`. It will compile without warning.

- Line 9: `List<String> list5 = new ArrayList<>();` - This line uses the diamond operator `<>` to infer the generic type based on the left-hand side declaration. It will compile without warning.

So, the correct options are:
- Line 8: `List<String> list4 = new ArrayList<String>();`
- Line 9: `List<String> list5 = new ArrayList<>();`
 */