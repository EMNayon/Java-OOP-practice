
package constructor;
public class My {
   // The name of the constructor method cannot be anything else, it must be the name of the class
   // default constructor
//   My(){
//       System.out.println("This is a constructor method");
//   }
    
    // parameterized constructor
    My(int a){
       int x = a;
       System.out.println(x);
   }
   My(double b){
       double y = b;
       System.out.println(y);
   }
   public void demo(){
       System.out.println("This is a normal method");
   } 
}
