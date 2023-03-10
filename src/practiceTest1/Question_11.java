package practiceTest1;

/** Which is not a valid statement based on given code?

 class A{}
 class B extends A{}

 Options are :

 A a = new A();
 A a = new B();
 B a = new B();
 B b = new A(); (Correct)
 }
**/
class A {
    public void displayShape(){
        System.out.println("A");
    }
}
class B extends A{
    public void movePiece(){
        System.out.println("B");
    }
}
public class Question_11{
    public static void main(String[] args) {
/*        A a = new A();
        a.displayShape();*/
    A a = new B();
    a.displayShape();
    B b = new B();

    }
}