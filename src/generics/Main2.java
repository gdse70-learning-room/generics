package generics;

/*
    @author DanujaV
    @created 1/31/24 - 10:19 AM   
*/

public class Main2 {
    static void abc(int x) {    //method parameter
        System.out.println(x);
    }
    public static void main(String[] args) {
        abc(10);    //data

        CommonClass<Integer> icc;
        icc = new CommonClass<Integer>(10);

        CommonClass<String> scc;
        scc = new CommonClass<>("Danuja");

        CommonClass<Double> dcc =  new CommonClass<>(20.5);
        /*compile time safety*/
//        dcc.setObj(10);
//        dcc.setObj("Hello");
        dcc.setObj(10.5);

        CommonClass commonClass = new CommonClass(10);
        commonClass.setObj(20.5);
        commonClass.setObj("Hello");
        commonClass.setObj(true);

        CommonClass<Student> stcc = new CommonClass<>(new Student());
    }
}
