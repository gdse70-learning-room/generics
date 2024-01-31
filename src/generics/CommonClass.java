package generics;

/*
    @author DanujaV
    @created 1/31/24 - 10:12 AM   
*/

public class CommonClass<T> {   //type parameter
    T obj;

    public CommonClass(T obj) {
        this.obj = obj;
    }

    void setObj(T obj) {
        this.obj = obj;
    }

    void printClassName() {
        System.out.println("Class Name: " + getClass().getName());
    }
}
