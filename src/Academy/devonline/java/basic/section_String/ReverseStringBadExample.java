package Academy.devonline.java.basic.section_String;

public class ReverseStringBadExample {
    public static void main(String[] args) {
        // read source data
        String s = "Hello world!";

        // processing
        String res = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            // Use StringBuilder instead!
            res = res + s.charAt(i);
        }

        // display results
        System.out.println(res);
    }
}
