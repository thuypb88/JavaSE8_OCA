package Set1;
/*
#switch Statements, Legal Expressions for switch and case
For the class Test, which options, if used to replace '[INSERT]', will print TEN on to the console? Select 4 options.

        package com.cher.certification;

public class Test {
    public static void main(String[] args) {
       [INSERT]
        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}

    Options are :

        long var = 10;
        Integer var = 10; (Correct)
        Short var = 10; (Correct)
        byte var = 10; (Correct)
        double var = 10;
        char var = 10; (Correct)
        Answer :Integer var = 10; Short var = 10; byte var = 10; char var = 10;

 */

public class Q7 {
    public static void main(String[] args) {
        //Integer var = 10;
        //Short var = 10;
        //byte var = 10;
        char var = 10;
        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }

}


/*
To print "TEN" on the console, the following options can be used to replace [INSERT] in the given Test class:

int var = 10;

This option uses the int data type, which is compatible with the switch statement.
Integer var = 10;

This option uses the Integer wrapper class, which can be auto-unboxed to an int and is compatible with the switch statement.
short var = 10;

This option uses the short data type, which is compatible with the switch statement.
byte var = 10;

This option uses the byte data type, which is compatible with the switch statement.
The option char var = 10; is also a valid choice to replace [INSERT] in the given Test class to print "TEN" on the console.

The reason this option is valid is that the char data type in Java is a 16-bit Unicode character that can represent both characters and integral values. In this case, the char variable var is assigned the value of 10, which corresponds to the Unicode character '\n' (newline character).

When the switch statement is evaluated, it matches the case 10 with the value of var, and the code inside that case block is executed, resulting in the output "TEN" being printed to the console.

Therefore, the correct options to replace [INSERT] are:

int var = 10;
Integer var = 10;
short var = 10;
byte var = 10;
char var = 10;


 */