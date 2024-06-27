class StaticMethod1 {
    static void disp1() {
        System.out.println("Static disp1");
    }
    void disp2 () {
        System.out.println("Non Static disp2");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        StaticMethod1.disp1();
        //StaticMethod1.disp2() This is not possible

        StaticMethod1 SM1 = new StaticMethod1();
        SM1.disp2();
    }
}
