package Set1;

/*
What will be the result of compiling and executing Test class?

package com.cher.certification;

public class Test {
     public static void main(String[] args) {
         System.out.println(new Boolean("ture"));
     }
}

Options are :

false (Correct)
An exception is thrown at runtime
true
Compilation error
Answer :false
 */

public class Q_17 {
    public static void main(String[] args) {
       // System.out.println(new Boolean("true"));
        System.out.println(new Boolean("ture"));
    }
}
/*
The reason is that the code has a constructor named Test(), which has the same name as the class. In Java, constructors should not have a return type, not even void. However, in this case, the Test() method is not actually a constructor because it has a return type of void. It is just a regular method with the same name as the class.

Therefore, when an object of the Test class is created using the new Test() statement, the default constructor is called, and the name instance variable is not initialized within the constructor. As a result, the default value of null is assigned to the name variable.

Hence, when System.out.println(obj.name) is executed, it will print "null" to the console.
 */