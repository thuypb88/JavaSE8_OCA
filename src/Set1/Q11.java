
package Set1;
/*
Given code of LogHelper.java file:

package com.cher.certification;

abstract class Helper {
    int num = 100;
    String operation = null;

    protected abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

public class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

    void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
    }
}


Which of the following changes, done independently, allows the code to compile and on execution prints LogHelper-help?

Select ALL that apply.


Options are :

Add the protected modifier to the log() method of LogHelper class
Remove the protected modifier from the operation variable of LogHelper class
Add the protected modifier to the log() method of Helper class
Add the protected modifier to the help() method of LogHelper class (Correct)
Add the public modifier to the log() method of LogHelper class
Remove the private modifier from the num variable of LogHelper class
Remove the protected modifier from the help() method of Helper class (Correct)
Add the public modifier to the help() method of LogHelper class (Correct)
Answer :Add the protected modifier to the help() method of LogHelper class Remove the protected modifier from the help() method of Helper class Add the public modifier to the help() method of LogHelper class
 */

import java.util.ArrayList;
import java.util.List;
abstract class Helper {
    int num = 100;
    String operation = null;

 //   protected abstract void help();
  //  abstract void help();
      abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

public class Q11 extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

   // protected void help() {
   public void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new Q11().help();
    }

}











