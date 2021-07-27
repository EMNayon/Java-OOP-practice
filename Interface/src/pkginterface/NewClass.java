
package pkginterface;

// Methods are not accounted for in making large software, so the interface is only used as a blueprint of the method.
//An interface is an empty class that contains a method but does not contain any body parts.
interface First{
    void FirstMethod();
}
interface Second{
    void SecondMethod();
}
interface Third{
    void ThirdMethod();
}

public class NewClass implements First,Second,Third {
    // Override........
    public void FirstMethod(){
        System.out.println("My First interface");
    }
    public void SecondMethod(){
        System.out.println("My Second interface");
    }
    public void ThirdMethod(){
        System.out.println("My Third interface");
    }
}
