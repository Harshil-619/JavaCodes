@FunctionalInterface
interface car {
    void drive (int avg, int ts);
}

public class LambdaExpression {
    public static void main(String[] args) {
        car obj = (avg,ts) -> System.out.println("Driving with avg: " + avg + " and with top speed of :" + ts);
        obj.drive(60,160);
    }
}
