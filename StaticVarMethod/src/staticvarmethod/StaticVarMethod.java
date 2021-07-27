
package staticvarmethod;
public class StaticVarMethod {
    public static void main(String[] args) {
//        MyClass objectholder = new MyClass();
        //When we declare static variables or method, we do not have to create objects of that class
        System.out.println(MyClass.a);
        MyClass.add();
    }
    
}
