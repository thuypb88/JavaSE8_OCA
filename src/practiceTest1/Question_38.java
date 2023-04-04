
package practiceTest1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class Counter{
    int count;
    Counter(int count){
        this.count = count;
    }
    public String toString(){
        return "Counter-" + count;
    }
}

public class Question_38 {
    public static void main(String[] args) {
        ArrayList<Counter> org = new ArrayList<>();
        org.add(new Counter(10));
        ArrayList<Counter> cloned = (ArrayList<Counter>) org.clone();
        cloned.get(0).count = 5;
        System.out.println(org);
    }

}
