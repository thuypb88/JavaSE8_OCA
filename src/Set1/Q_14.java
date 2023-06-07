package Set1;
/*
What will be the result of compiling and executing Test class?

package com.cher.certification;

public class Test {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.print(arr[i][j]); //Line n6
            }
        }
    }
}

Options are :

6
753
7
75
7654321
642 (Correct)
64
7531
Answer :642
 */

public class Q_14 {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2

                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
               System.out.print(arr[i][j]); //Line n6
            }
        }

    }
}
/*
In this code, we have a 2-dimensional string array arr with three rows and varying column lengths. The outer loop (Line n1) iterates over the rows of the array, and the inner loop (Line n2) iterates over the columns of each row.

At each iteration of the inner loop, the switch statement (Line n3) checks the value of arr[i][j]. If the value matches "2", "4", or "6", the break statement (Line n4) is encountered, which exits the inner loop and moves to the next iteration of the outer loop.

If the value does not match "2", "4", or "6", the default case is executed, and the continue statement (Line n5) is encountered. This skips the remaining code in the inner loop and moves on to the next iteration of the inner loop.

Therefore, let's go through the iterations:

i = 0, j = 0: The value is "7", which does not match "2", "4", or "6". So, it executes the default case, encounters the continue statement, and skips to the next iteration of the inner loop.

i = 0, j = 1: The value is "6", which matches "6". It encounters the break statement, which exits the inner loop.

i = 1, j = 0: The value is "4", which matches "4". It encounters the break statement, which exits the inner loop.

i = 1, j = 1: The value is "3", which does not match "2", "4", or "6". So, it executes the default case, encounters the continue statement, and skips to the next iteration of the inner loop.

i = 2, j = 0: The value is "2", which matches "2". It encounters the break statement, which exits the inner loop.

i = 2, j = 1: The value is "1", which does not match "2", "4", or "6". So, it executes the default case, encounters the continue statement, and skips to the next iteration of the inner loop.

After all iterations, the code does not print any values inside the inner loop (Line n6). As a result, the output will be "642".

I apologize for the incorrect explanations in my previous responses. Thank you for bringing it to my attention.

 */