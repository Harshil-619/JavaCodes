import java.nio.ShortBuffer;

import javax.sound.sampled.SourceDataLine;

public class Typecasting {
    public static void main(String[] args) {
        int a = 45;
        double b;
        b = a;
        System.out.println(b); // Implicit Typecasting

        double num1 = 45.5;
        int num2;
        num2 = (int) num1; // Explicit Typecasting, we cannot perform demotion of any variable without
                           // explicit typecasting
        System.out.println(num2);

        int x = 7;
        int y = 2;
        float res = x / y;
        System.out.println(res); // res = 3.0 becoz x & y are int type datas

    }
}
