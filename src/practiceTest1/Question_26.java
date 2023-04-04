
package practiceTest1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Question_26 {
    public static void main(String[] args) {
        String [] names = {"Smith","Brown","Thomas","Taylor","Jones"};
//        System.out.println(names);
        List<String> list = new ArrayList<>();
        System.out.println(names.length);
        for(int x = 0; x < names.length; x++){
            list.add(names[x]);
            switch (x){
                case 2: continue;
            }
            break;
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
