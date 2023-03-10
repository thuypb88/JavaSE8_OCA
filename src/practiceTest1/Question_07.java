package practiceTest1;
/** Q:For the class Test, which options, if used to replace *//*INSERT will print TEN on to the console? Select 4 options.
    A: A switch’s expression must evaluate to a char, byte, short, int, an enum (as of Java 5), and a
String (as of Java 7).
Integer var = 10;
Short var = 10;
byte var = 10;
char var = 10;
**/
import java.util.ArrayList;
import java.util.List;

public class Question_07 {
    public static void main(String[] args) {
        /*INSERT*/
        int var = 10;
        //short var = 10;
        //byte var = 10;
        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}