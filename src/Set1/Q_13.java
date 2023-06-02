package Set1;
/*
Choose the options that meets the following specification:

Create a well encapsulated class Clock with one instance variable model.

The value of model should be accessible and modifiable outside Clock.


Options are :

public class Clock { public String model; private String getModel() { return model; } private void setModel(String val) { model = val; } }
public class Clock { private String model; public String getModel() { return model; } public void setModel(String val) { model = val; } } (Correct)
public class Clock { public String model; }
public class Clock { public String model; public String getModel() { return model; } public void setModel(String val) { model = val; } }
Answer :public class Clock { private String model; public String getModel() { return model; } public void setModel(String val) { model = val; } }
 */

public class Q_13 {
    private String model;
    public String getModel() { return model; }
    public void setModel(String val) { model = val; }
    public static void main(String[] args) {
        Q_13 clock = new Q_13();
        clock.setModel("Digital");
        String clockModel = clock.getModel();
        System.out.println("Clock Model: " + clockModel);

    }
}
