// import javax.sound.sampled.SourceDataLine;

// class demo 
// {

//    public void a()
//     {
//         b();
//     }
//    public void b() 
//     {
//         int num1= 9;
//         int num2=0; 
//         try {
//         int result = num1/num2; //Critical statement
//         System.out.println(result);
//         }
//         catch(ArithmeticException e) {
//             System.out.println("error" + e.getMessage());
//         }
//         System.out.println("Bye");
//     }
    
// }

// public class ExceptionThrows {
//     public static void main(String[] args) {
//         demo obj = new demo();
//         obj.a();
        
//     }
// }


// import javax.sound.sampled.SourceDataLine;

// class demo 
// {

//    public void a()
//     {
//         try {
//         b();
//         }
//         catch (Exception e) {
//             System.out.println("Error " + e.getMessage());
//         }
//     }
//    public void b() throws Exception
//     {
//         int num1= 9;
//         int num2=0; 
       
//         int result = num1/num2; //Critical statement
//         System.out.println(result);
        
       
//         System.out.println("Bye");
//     }
    
// }

// public class ExceptionThrows {
//     public static void main(String[] args) {
//         demo obj = new demo();
//         obj.a();
        
//     }
// }


import javax.sound.sampled.SourceDataLine;

class demo 
{

   public void a() throws Exception
    {  
        b();
    }
   public void b() throws Exception
    {
        int num1= 9;
        int num2=0; 
       
        int result = num1/num2; //Critical statement
        System.out.println(result);
        
       
        System.out.println("Bye");
    }
    
}

public class ExceptionThrows {
    public static void main(String[] args) {
        demo obj = new demo();
        try {
        obj.a();
        }
         catch (Exception e) {
            System.out.println(" THrown Error is  " + e.getMessage());
        }
        
    }
}
