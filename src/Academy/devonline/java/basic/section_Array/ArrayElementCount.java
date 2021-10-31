package Academy.devonline.java.basic.section_Array;

public class ArrayElementCount {
    public static void main(String[] args) {

        // read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;

        // processing
        var count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }

        // display results
        System.out.println(count);
    }
}
