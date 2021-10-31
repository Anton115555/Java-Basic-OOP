package Academy.devonline.java.basic.section_Array;

public class ArrayElementSum {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5};

        // processing
        var sum = 0;
        for (int value : array) {
            sum += value; // sum = sum + value;
        }

        // display results
        System.out.println(sum);
    }
}
