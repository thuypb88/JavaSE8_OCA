package practiceTest1;
/*Q:What will be the result of compiling and executing Test class?

A: null:true
*/
import java.util.ArrayList;
import java.util.List;

public class Question_05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        //System.out.println(list);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}