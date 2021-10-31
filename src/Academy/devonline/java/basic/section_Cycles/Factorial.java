package Academy.devonline.java.basic.section_Cycles;

public class Factorial {
    public static void main(String[] args) {
        // read source data
        var value = 5;

        // processing
        String finalResult;
        if (value < 0) {
            finalResult = "Value should be >=0";
        } else {
            var result = 1;
            for (var i = 1; i <= value; i++) {
                var oldResult = result;
                result *= i; // result = result * i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
        }

        // display results
        System.out.println(finalResult);
    }
}
