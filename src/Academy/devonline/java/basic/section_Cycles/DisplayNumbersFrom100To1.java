package Academy.devonline.java.basic.section_Cycles;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        // read source data
        var from = 100;
        var to = 1;
        var step = 1;

        // display results
        for (int i = from; i >= to; i -= step) {
            System.out.println (i + " ");
        }
        System.out.println ();
    }
}
