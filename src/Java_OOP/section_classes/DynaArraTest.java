package Java_OOP.section_classes;

import Java_OOP.Structures.DynaArray;

public class DynaArraTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();

        dynaArray1.add(1);
        dynaArray1.add(2);

        System.out.println ("-----------------------------" );

        dynaArray2.add(34);
        dynaArray2.add (45);

       // System.out.println(dynaArray1.count);
        System.out.println ("-----------------------------" );
     //   System.out.println(dynaArray2.count);
    }
}
