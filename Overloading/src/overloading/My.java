
package overloading;
public class My {
    //Method Overloading
    //Change of parameter
//    public void load(int a, int b){
//        int c = a + b;
//        System.out.println(c);
//    }
//    public void load(int x, int y, int z){
//        int w = x + y + z;
//        System.out.println(w);
//    }
    
    //Change of data type
    public void load(double a, double b){
        double c = a + b;
        System.out.println(c);
    }
    public void load(int x, int y){
        int w = x + y;
        System.out.println(w);
    }
}
