package simulationSet01;
/*
A bank's swift code is generally of 11 characters and used in international money transfers.
An example of swift code: ICICINBBRT4
ICIC: First 4 letters for bank code
IN: Next 2 letters for Country code
BB: Next 2 letters for Location code
RT4: Next 3 letters for Branch code

Which of the following code correctly extracts country code from the swift code referred by String reference variable swiftCode?
Options are :

swiftCode.substring(5, 6);
swiftCode.substring(4, 6); (Correct)
swiftCode.substring(5, 7);
swiftCode.substring(4, 5);
Answer :swiftCode.substring(4, 6);
 */
public class Q3 {
    public static void main(String[] args) {
        String swiftCode = "ICICINBBRT4";
        System.out.println(swiftCode.substring(4,6));
        System.out.println(swiftCode.substring(5, 6));
        System.out.println(swiftCode.substring(5, 7));
        System.out.println(swiftCode.substring(4, 5));
    }
}
