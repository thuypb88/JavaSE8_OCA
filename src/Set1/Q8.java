
package Set1;
/*
#switch Statements, Legal Expressions for switch and case
What is the output if below program is run with the command line:

java Test

public class Test {
     public static void main(String[] args) {
         System.out.println(args.length);
     }
}



Options are :

NullPointerException
ArrayIndexOutOfBoundsException
0 (Correct)
1
Answer :0
 */

public class Q8 {
    public static void main(String[] args) {
        System.out.println(args.length);
    }

}


/*
Explanation:

The args parameter in the main method represents the command-line arguments passed to the Java program. In this case, when you run the program using java Test without any additional arguments, the args array will be empty, resulting in args.length being 0.

Therefore, the correct output is:

0

 */