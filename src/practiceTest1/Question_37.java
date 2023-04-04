
package practiceTest1;

import java.time.LocalDate;
import java.time.Period;

public class Question_37 {
    public static void main(String[] args) {
        Period period = Period.of(0,0,0);
        System.out.println(period);

        LocalDate date1 = LocalDate.of(2017, 1 , 31);
        Period period1 = Period.ofMonths(1);
        System.out.println(date1);
        date1.plus(period1);
        System.out.println(date1);
    }

}
