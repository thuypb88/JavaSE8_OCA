package simulationSet01;

import java.util.ArrayList;

class Counter {
    int count;
    Counter(int count){
        this.count = count;
    }
    public String toString(){
        return "Counter-" + count;
    }
}
public class Q7 {
    public static void main(String[] args) {
        ArrayList<Counter> org = new ArrayList<>();
        org.add(new Counter(10));
        System.out.println("Org1:" +org);

        ArrayList<Counter> cloned = (ArrayList<Counter>) org.clone();
       cloned.get(0).count = 5;
        System.out.println("Org2:" +org);
    }
}
