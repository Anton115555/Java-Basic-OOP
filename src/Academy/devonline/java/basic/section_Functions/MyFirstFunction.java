package Academy.devonline.java.basic.section_Functions;

public class MyFirstFunction {
    public static void main(String[] args) {
        // read source data
        int a = 2;
        int b = 3;

        //processing
        int res = multiply (a, b);
    }

    private static int multiply(int a, int b) {
        return a*b;
    }
}
