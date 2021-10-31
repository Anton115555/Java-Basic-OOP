package Academy.devonline.java.basic.section_Cycles;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        // read source data
        var to = 20;

        //display results
        for (int i = 1; i <= to; i++) {
            for (int j = 1; j <= to; j++) {
                var res = i * j;
                System.out.print ((res == 1 ? "" : res) + "\t");
            }
            System.out.println ( );
        }
    }
}