package Set1;
/*
Which is not a valid statement based on given code?

class A{}
class B extends A{}

Options are :

A a = new A();
A a = new B();
B a = new B();
B b = new A(); (Correct)
Answer :B b = new A();
 */

public class Q_12 {
}
/*
The statement "B b = new A();" is not a valid statement based on the given code.

Inheritance allows a subclass to be treated as its superclass, but it does not work the other way around. In this case, class B extends class A, which means B is a subclass of A. Therefore, you can assign an instance of B to a variable of type A, but you cannot assign an instance of A to a variable of type B.

Valid statements based on the given code are:

A a = new A();
A a = new B();
B a = new B();
These statements are valid because they create instances of class A and class B respectively, and assign them to variables of compatible types.

 */