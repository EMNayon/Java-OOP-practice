
package accessmodifiers;
public class A {
    // Modifier is a public
    // within package or everywhere
//    public String S = "Hello";
    
    //Modifier is a protected
   protected String pro = "Hello";
    
    // modifier is a default
    String def = "Hello";
    
    // private access modifier
    private String pri = "Hello";
    void A_method(){
        System.out.println(pri);
    }
}
