package withoutgenerics;/*
    @author DanujaV
    @created 1/31/24 - 9:56 AM   
*/

public class StringClass {
    String obj;

    public StringClass(String obj) {
        this.obj = obj;
    }

    void setObj(String obj) {
        this.obj = obj;
    }

    void printClassName() {
        System.out.println("Class Name: " + getClass().getName());
    }
}
