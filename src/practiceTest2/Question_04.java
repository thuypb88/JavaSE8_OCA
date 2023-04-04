package practiceTest2;
import java.time.Period;

/*
Consider below code:

//Test.java
package com.cher.certification;

import java.time.Period;

public class Test {
     public static void main(String [] args) {
         Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
         System.out.println(period);
     }
}
What will be the result of compiling and executing Test class?


Options are :

P2D (Correct)
P2Y1M0D
P2Y1M
P12Y6M2D
Answer :P2D
}*/
public class Question_04 {
    public static void main(String[] args) {
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period);

    }

}
