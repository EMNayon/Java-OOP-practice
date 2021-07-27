
package localvariable;
public class MyClass {
    public int ins;
    public void add(){
        //declare local variable
        //local variable can't declare access modifer. we can't acces local variable direct others function or other class
        int a = 204;
        //But If we want access local variable. must be use instance variable. then we can access local variable
        this.ins = a;
        int b = 23;
        int c;
        c = a + b;
        System.out.println(c);
    }
}
