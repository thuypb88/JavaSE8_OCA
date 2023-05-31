package Set1;
/*
#String: string literal concatenation
https://chercher.tech/java-certification/java-se-8-certification-ocajp-1z0-808-practice-tests-set-1
Consider below code:

//Test.java
package com.cher.certification;

public class Test {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
    }
}
What will be the result of compiling and executing Test class?


Options are :

false false
false true (Correct)
true false
true true
Answer :false true
 */
public class Q1 {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);

    }

}

/*
Let's analyze the code line by line:

final String fName = "James";

fName is a final variable with the value "James".
String lName = "Gosling";

lName is a variable with the value "Gosling".
String name1 = fName + lName;

name1 is assigned the concatenated value of fName and lName. Since both fName and lName are variables, the concatenation is performed at runtime, and a new string object is created.
String name2 = fName + "Gosling";

name2 is assigned the concatenated value of fName and the string literal "Gosling". The concatenation is performed at compile-time, and a new string object is created.
String name3 = "James" + "Gosling";

name3 is assigned the concatenated value of the string literals "James" and "Gosling". The concatenation is performed at compile-time, and a new string object is created.
System.out.println(name1 == name2);

This statement compares name1 and name2 using the == operator, which checks for reference equality. Since name1 and name2 refer to different string objects (one created at runtime, the other at compile-time), the result is false.
System.out.println(name2 == name3);

This statement compares name2 and name3 using the == operator. Both name2 and name3 refer to the same string object created at compile-time (due to string literal concatenation). Therefore, the result is true.
 */