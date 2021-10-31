package Academy.devonline.java.basic.section_Cycles;

public class SumFrom1To100 {
    public static void main(String[] args) {
        // read source data
        var from = 1;
        var to = 100;

        // processing
        var sum = 0;
        for (var i = from; i <= to; i++) {
            sum += i;// sum = sum + i;
        }

        // display results
        System.out.println(sum);
    }
}
