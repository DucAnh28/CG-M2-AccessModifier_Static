package TH_1_StaticMethod;

public class StaticMethod {
    private int rollo;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int r,String n){
        this.rollo = r;
        this.name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollo + " " + name + " " + college);
    }

}
