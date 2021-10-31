package Academy.devonline.java.basic.section_Array;

public class LinearSearch {
    public static void main(String[] args) {
        // read source data
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 7;

        // processing
        var index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;
                break;
            }
        }

        // display results
        System.out.println(index);
    }
}
