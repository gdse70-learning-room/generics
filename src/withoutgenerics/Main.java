package withoutgenerics;/*
    @author DanujaV
    @created 1/31/24 - 9:50 AM   
*/

public class Main {
    public static void main(String[] args) {
        IntegerClass ic = new IntegerClass(10);
        ic.printClassName();  // Class Name: withoutgenerics.IntegerClass

//        new withoutgenerics.IntegerClass(20.5);
        DoubleClass dc = new DoubleClass(20.5);
        dc.printClassName();  // Class Name: withoutgenerics.DoubleClass

        BooleanClass bc = new BooleanClass(true);
        bc.setObj(10 > 4);
        bc.printClassName();

        StringClass sc = new StringClass("Saman");
        sc.printClassName();
    }
}
