package Set1;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
What will be the result of compiling and executing Test class?

package com.cher.certification;

public class Test {
     public String name;
     public void Test() {
         name = "James";
     }

     public static void main(String [] args) {
         Test obj = new Test();
         System.out.println(obj.name);
     }
}



Options are :

None of the above
null (Correct)
James
Compilation error
Answer :null
 */

public class Q_16 {
    public String name;
    public void Test() {
        name = "James";
    }
    public static void main(String[] args) {
        Q_16 obj = new Q_16();
        System.out.println(obj.name);
    }
}
/*
The reason is that the code has a constructor named Test(), which has the same name as the class. In Java, constructors should not have a return type, not even void. However, in this case, the Test() method is not actually a constructor because it has a return type of void. It is just a regular method with the same name as the class.

Therefore, when an object of the Test class is created using the new Test() statement, the default constructor is called, and the name instance variable is not initialized within the constructor. As a result, the default value of null is assigned to the name variable.

Hence, when System.out.println(obj.name) is executed, it will print "null" to the console.
 */