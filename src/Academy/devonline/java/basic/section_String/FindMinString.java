package Academy.devonline.java.basic.section_String;

public class FindMinString {
    public static void main(String[] args) {
        // read source data
        String[] array = {"one", "two", "three", "four", "five"};

        // processing
        String min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        // display results
        System.out.println(min);
    }
}
