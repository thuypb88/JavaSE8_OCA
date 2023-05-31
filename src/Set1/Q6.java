package Set1;
/*
#Forcing Garbage Collection
How can you force JVM to run Garbage Collector?


Options are :

By setting the reference variable to null.
By calling: System.gc();
JVM cannot be forced to run Garbage Collector. (Correct)
By calling: Runtime.getRuntime().gc();
Answer :JVM cannot be forced to run Garbage Collector.

 */

public class Q6 {
    public static void main(String[] args) {
    }

}


/*
The correct option to force JVM to run the garbage collector is:

By calling: System.gc();

Explanation:

In Java, the System class provides a gc() method that suggests to the JVM to run the garbage collector. However, it is important to note that the JVM has the final decision on whether or not to execute the garbage collector.

Calling System.gc() does not guarantee an immediate garbage collection. It merely suggests to the JVM that it's a good time to perform garbage collection. The JVM may or may not initiate garbage collection based on various factors such as available memory, current system load, and JVM implementation.

The other options mentioned are not valid:

Setting a reference variable to null does not directly trigger the garbage collector. It only makes the object referenced by that variable eligible for garbage collection if there are no other references to it.

Calling Runtime.getRuntime().gc() is essentially the same as calling System.gc(). The Runtime class provides access to the runtime environment and exposes the gc() method to suggest garbage collection.

To summarize, the preferred approach to request garbage collection in Java is by calling System.gc(). However, it's important to understand that the JVM has the final decision on when and if to perform garbage collection.
 */