
package practiceTest1;

import java.util.ArrayList;

public class Question_39 {
    public static void main(String[] args) {
        ArrayList<Counter> org = new ArrayList<>();
        org.add(new Counter(10));
        ArrayList<Counter> cloned = (ArrayList<Counter>) org.clone();
        cloned.get(0).count = 5;
        System.out.println(org);
    }

}
