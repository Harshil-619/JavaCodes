import javax.sound.sampled.SourceDataLine;

public class StaticBlockVsMethod {
    static int age = 19;
    static{
        System.out.println("Static block first");
        System.out.println((age));
    }
static void display() {
    System.out.println("Static display method main ke baad jab hum call karenge");
}
public static void main (String []args) {
    System.out.println("Main method baaad mein");
    display();
}
    
}
