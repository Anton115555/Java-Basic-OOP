package Academy.devonline.java.basic.section_Array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        // processing
        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println ( );

        }
        // display results
        System.out.println(Arrays.toString(array));
    }
}
