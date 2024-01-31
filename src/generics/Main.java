package generics;

/*
    @author DanujaV
    @created 1/31/24 - 10:11 AM   
*/

public class Main {
    public static void main(String[] args) {
        CommonClass icc = new CommonClass(10);
        icc.printClassName();
        icc.setObj(1000);

        CommonClass dcc = new CommonClass(20.5);
        dcc.printClassName();
        dcc.setObj(30.5);

        CommonClass scc = new CommonClass("Danuja");
        scc.printClassName();
        scc.setObj("Vithanage");
    }
}
