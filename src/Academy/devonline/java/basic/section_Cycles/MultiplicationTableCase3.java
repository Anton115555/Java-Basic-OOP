package Academy.devonline.java.basic.section_Cycles;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        // read source data
        var to = 9;
        var cols = 4;

        //display results
        for (int r = 2; r <= to; r += cols) {
            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + cols && j <= to; j++) {
                    System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
