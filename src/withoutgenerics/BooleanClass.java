package withoutgenerics;/*
    @author DanujaV
    @created 1/31/24 - 9:56 AM   
*/

public class BooleanClass {
    Boolean obj;

    public BooleanClass(Boolean obj) {
        this.obj = obj;
    }

    void setObj(Boolean obj) {
        this.obj = obj;
    }

    void printClassName() {
        System.out.println("Class Name: " + getClass().getName());
    }
}
