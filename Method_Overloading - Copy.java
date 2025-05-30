class MethodOverloading {
    public int add (int n1, int n2) {
        int result = n1+n2;
        return result;
    }
    public int add (int n1, int n2, int n3) {
        int result = n1+n2+n3;
        return result;
    }
    public double add (double N1, double N2) {
       double result = N1+N2;
        return result;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        int result = obj.add(3,4);
        int res1 = obj.add(3,4,3);
        double res2 = obj.add(2.4,3.6);
        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);

    }
}