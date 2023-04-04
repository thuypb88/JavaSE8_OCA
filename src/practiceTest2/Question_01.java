package practiceTest2;

import java.time.LocalDate;

/*
What will the following program print when compiled and run? (Choose one)

import java.time.LocalDate;
public class MyClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 1);
        date.withYear(5);
        System.out.println(date.plusMonths(12));
    }

 Options are :

The program will print 0006-01-01.
The program will print 2016-01-01. (Correct)
The program will not compile.
The program will print 2015-01-01.
Answer :The program will print 2016-01-01.

}*/
public class Question_01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 1);
        date.withYear(5);
        System.out.println(date);
        System.out.println(date.withYear(5));
        System.out.println(date.plusMonths(12));
    }
}
