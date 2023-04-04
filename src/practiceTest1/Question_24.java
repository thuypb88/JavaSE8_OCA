
package practiceTest1;

public class Question_24 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        System.out.println("s1:" + s1);
        String s2 = sb.toString();
        System.out.println("s2:" + s2);
        System.out.println(s1==s2);
    }
}
