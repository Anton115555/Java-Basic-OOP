package Academy.devonline.java.basic.section_Functions;

public class VarArgsExampleRestriction {
    public static void main(String[] args) {
        /*System.out.println(concat(new String[]{}));
        System.out.println(concat(new String[]{"Hello"}));
        System.out.println(concat(new String[]{"Hello", "World"}));
        System.out.println(concat(new String[]{"Hello", " ", "world", "!"}));*/

        System.out.println(concat());
        System.out.println(concat("Hello"));
        System.out.println(concat("Hello", "World"));
        System.out.println(concat("Hello", " ", "world", "!"));
    }

    // private static String concat(String[] args) {
    private static String concat(String... args) {
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg);
        }
        return builder.toString();
    }

    /*private static String concat(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg);
        }
        return builder.toString();
    }*/
    }

