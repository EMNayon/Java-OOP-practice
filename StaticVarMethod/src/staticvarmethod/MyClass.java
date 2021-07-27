
package staticvarmethod;
public class MyClass {
    //static variable
    public static int a = 10;
    public int b = 10;
    public int c;
    //static function
    public static void add(){
        int ab = 10;
        int bc = 20;
        int abc = ab + bc;
        System.out.println(abc);
    }
}
