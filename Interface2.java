 interface computer 
    {
        void compileCode ();
    }

class Laptop implements computer{
    public void compileCode ()
    {
        System.out.println("You got 5 errors");
    }
}

class Desktop implements computer {
    public void compileCode ()
    {
        System.out.println("You got 5 errors, faster");
    }
}

class Developer {
    public void buildApp (computer obj)
    {
        System.out.println("Building an App");
        obj.compileCode();
    }
}
public class Interface2 {
    public static void main(String[] args) {
        computer obj = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj); // developer gets laptop only thats why only laptop class method can run not dektop. Thus interface is used for specifications.

    }
   
}
