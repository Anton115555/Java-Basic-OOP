package Academy.devonline.java.basic.section_Functions;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println (div (1, 2)); // div_int_int
        System.out.println (div (1., 2.));// div_double_double
    }

    private static int div(int a, int b) {
        return a / b;
    }

    private static double div(double a, double b) {
        return a / b;

    }
}
