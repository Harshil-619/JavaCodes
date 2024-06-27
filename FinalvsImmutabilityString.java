// public class FinalvsImmutabilityString {
//     public static void main(String[] args) {
//        final String S = new String("Virat");
//         System.out.println(S);
//         S = S.concat(" kohli");
//         System.out.println(S);
//     }
    
// }


public class FinalvsImmutabilityString {
    public static void main(String[] args) {
      final StringBuffer S = new StringBuffer("Virat");
        System.out.println(S);
        S.append(" kohli");
        System.out.println(S);
        S = new StringBuffer("Sachin"); //error
        System.out.println(S);
    }
    
}
