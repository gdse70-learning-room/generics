package boundedtype;

/*
    @author DanujaV
    @created 1/31/24 - 11:16 AM   
*/

public class Calculator<T1 extends Number, K1> {
    T1 obj1;
    K1 obj2;

    public Calculator(T1 obj1, K1 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
    }
}
