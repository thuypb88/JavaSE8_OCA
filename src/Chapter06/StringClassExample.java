package Chapter06;

public class StringClassExample {
    public static void main(String[] args) {
       String s1 = new String();
        s1 = "abcdef_1";
        System.out.println(s1);

        String s2 = new String("abcdef_2");
        System.out.println(s2);

        String s3 = s1;
        s3 = s3.concat(" more stuff");
        System.out.println(s3);

        String x = "Java";
        x.concat(" Rules!");
        System.out.println("x = " + x);
/*


        equalsIgnoreCase() Determines the equality of two strings, ignoring case
         length() Returns the number of characters in a string
        replace() Replaces occurrences of a character with a new character
        substring() Returns a part of a string
        toLowerCase() Returns a string, with uppercase characters converted to lowercase
        toString() Returns the value of a string
        toUpperCase() Returns a string, with lowercase characters converted to uppercase
        trim() Removes whitespace from both ends of a string

 */
       // charAt() Returns the character located at the specified index
        String x1 = "airplane";
        System.out.println(x1.charAt(2)); // r
        //  concat() Appends one string to the end of another (+ also works)
        String x2 = "taxi";
        System.out.println(x2.concat(" cab")); //taxi cab

        String x3 = "library";
        System.out.println(x3 + " card");

        String x4 = "Atlantic";
        x4+= " ocean";
        System.out.println(x4);
    }
}
