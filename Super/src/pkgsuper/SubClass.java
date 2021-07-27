
package pkgsuper;
public class SubClass extends SuperClass{
    // Super can be used to refer immediate parent class instance variable
    
//    String S = "From Sub Class";
//    // without super keywords
//    void Print(){
//        System.out.println(S);
//    }
//    // with super keywords
//    void PrintSuper(){
//        System.out.println(super.S);
//    }
    
    //Super can be used to invoke immediate parent class method
    //override method
    void Print(){
        super.Print();
        System.out.println("From Sub");
    }
    
    //Super() can be used to invoke immediate parent class constructor
    //Override......
    SubClass(){
        super();
        System.out.println("From Sub Constructor");
    }
    
}
