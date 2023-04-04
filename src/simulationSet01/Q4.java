package simulationSet01;
/*
Consider below code of Test.java file:
package com.udayankhattry.ocp1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<String> sports = new ArrayList<>();
        sports.add("Windsurfing");
        sports.add("Aerobics");
        sports.add("Archery");
        sports.add("Diving");

        Iterator<String> iterator = sports.iterator();
        while(iterator.hasNext()) {
            String sport = iterator.next();
            if(sport.startsWith("A")) {
                sports.remove(sport);
            }
        }

        System.out.println(sports);
    }
}


What will be the result of compiling and executing Test class?


Options are :

An exception is thrown at runtime (Correct)
Compilation error
[Windsurfing, Aerobics, Archery, Diving]
[Windsurfing, Diving]
Answer :An exception is thrown at runtime
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<String> sports = new ArrayList<>();
        sports.add("Windsurfing");
        sports.add("Aerobics");
        sports.add("Archery");
        sports.add("Diving");

        Iterator<String> iterator = sports.iterator();
        while(iterator.hasNext()) {
            String sport = iterator.next();
            if(sport.startsWith("A")) {
                sports.remove(sport);
            }
        }

        System.out.println(sports);
    }
}
