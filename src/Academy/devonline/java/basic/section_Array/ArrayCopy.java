package Academy.devonline.java.basic.section_Array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // read source data
        int[] source = {1, -2, 3, -4, 5};

        // processing
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        // System.arraycopy(source, 0, destination, 0, source.length);

        // display results
        System.out.println(Arrays.toString(destination));
    }
}
