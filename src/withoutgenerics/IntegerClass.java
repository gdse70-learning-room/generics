package withoutgenerics;/*
    @author DanujaV
    @created 1/31/24 - 9:52 AM   
*/

public class IntegerClass {
    Integer obj;

    public IntegerClass(Integer obj) {
        this.obj = obj;
    }

    void setObj(Integer obj) {
        this.obj = obj;
    }

    void printClassName() {
        System.out.println("Class Name: " + getClass().getName());
    }
}
