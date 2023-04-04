package simulationSet01;
/*
For the class Test, which option, if used to replace /INSERT/, will print "Lucky no. 7" on to the console?

        package com.cher.certification;

public class Test {
    public static void main(String[] args) {
        /INSERT/
        switch(var) {
            case '7':
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}

    Options are :

        Integer var = 7;
        int var = 7;
        int var = '7'; (Correct)
        None of the other options
        Answer :int var = '7';

     Options are :

        Character var = 7;
        Integer var = 7;
        Character var = '7'
        char var = 7;
        char var = '7';
        Answer : Integer var = 7; char var = 7;Character var = 7;
 */
public class Q6 {
    public static void main(String[] args) {
        // A
      // int var = 7;
       int var = '7';
     // Integer var = 7;
        System.out.println(var);
                switch(var) {
                    case '7':
                        System.out.println("Lucky no. 7");
                        break;
                    default:
                        System.out.println("DEFAULT");
                }
        // B
/*        Integer var = 7;
        System.out.println(var);
        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }*/
    }
}
