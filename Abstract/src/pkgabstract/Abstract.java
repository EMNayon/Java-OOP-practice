
package pkgabstract;
public class Abstract {
    public static void main(String[] args) {
        // Cannot create any object in NewClass{} class because it is an abstract class
        //NewClass obj = new NewClass();
        Help obj = new Help();
        Help1 obj1 = new Help1();
        obj.demo();
        obj1.demo();
    }
    
}
