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
    private String model;
    public String getModel() { return model; }
    public void setModel(String val) { model = val; }
    public static void main(String[] args) {
        Q_14 clock = new Q_14();
        clock.setModel("Digital");
        String clockModel = clock.getModel();
        System.out.println("Clock Model: " + clockModel);

    }
}
