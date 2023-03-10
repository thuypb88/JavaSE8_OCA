package practiceTest1;

/** What will be the result of compiling and executing Test class?
 * Options are :
 *
 * 6
 * 753
 * 7
 * 75
 * 7654321
 * 642 (Correct)
 * 64
 * 7531
 *
 *
**/

public class Question_12{
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