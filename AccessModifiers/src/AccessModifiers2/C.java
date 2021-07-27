
package AccessModifiers2;
import accessmodifiers.A;
//public class C {
//    void C_method(){
//        A obj = new A();
//        // Access the public access modifiers variables
//        System.out.println(obj.S);
//    }
//}


    // access  the protected access modifiers variables
    //If you want to access protected access modifiers, you have to extend that class
//public class C {
//    void C_method(){
//        A obj = new A();
            // access  the protected access modifiers variables
            //If you want to access protected access modifiers, you have to extend that class
//        System.out.println(obj.pro);
//    }
//}

     // Default access modifers
//public class C {
//    void C_method(){
//        A obj = new A();
//        // We cannot access the default access modifiers, outside of the package
//        System.out.println(obj.def);
//    }
//}

public class C {
    void C_method(){
        A obj = new A();
        System.out.println(obj.pri);
    }
}