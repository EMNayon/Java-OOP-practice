
package accessmodifiers;
public class B {
    // access the public access modifiers variables
//    void B_method(){
//        A objA = new A();
//        System.out.println(objA.S);
//    }
    // access the protected access modifiers variables
//     void B_method(){
//        A objA = new A();
//        System.out.println(objA.pro);
//    }
    //Access the default access modifiers variable
//    void B_method(){
//        A objA = new A();
//        //We can access the default access modifiers inside the package
//        System.out.println(objA.def);
//    }
    
    void B_method(){
        A objA = new A();
        // If we have private access modifiers we can only use them within that class, not any other class or package.
        System.out.println(objA.pri);
    }
}
