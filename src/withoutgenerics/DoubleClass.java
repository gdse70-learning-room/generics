package withoutgenerics;/*
    @author DanujaV
    @created 1/31/24 - 9:56 AM   
*/

public class DoubleClass {
    Double obj;

    public DoubleClass(Double obj) {
        this.obj = obj;
    }

    void setObj(Double obj) {
        this.obj = obj;
    }

    void printClassName() {
        System.out.println("Class Name: " + getClass().getName());
    }
}
