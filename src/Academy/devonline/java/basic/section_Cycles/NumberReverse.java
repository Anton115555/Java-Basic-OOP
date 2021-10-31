package Academy.devonline.java.basic.section_Cycles;

public class NumberReverse {
    public static void main(String[] args) {
        // read source data
        var number = 123456789;

        // processing
        var result = 0;
        var temp = number;
        while (temp != 0) {
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10; // temp = temp / 10
        }

        // display results
        System.out.println("Reverse number: " + result);
    }
}
