
package practiceTest1;

import java.util.ArrayList;
import java.util.List;

public class Question_28 {
    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        System.out.println(list);
        list.add(new String("Hello"));
        System.out.println(list);
        list.add(s);
        s.replace("l","L");
        System.out.println(list);

    }
}
