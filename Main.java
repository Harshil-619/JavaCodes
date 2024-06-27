import java.util.Scanner;

class ThisKeyword {

    private int a = 4;

   private int b = 1;

void getSum(int a, int b) {

     this.a = a;

     this.b = b;

     System.out.println(this.a + this.b);

   }

}

 

public class Main {

   public static void main(String args[]) {

     ThisKeyword T = new ThisKeyword();

     T.getSum(3, 5);

  }

}
