
package constructor;
public class Constructor {
    public static void main(String[] args) {
        // When we create a object then automatic constructor is created.
        // class name(my) object(obj) = new keyword and default constructor(My())
        //You don't have to call an object to call the constructor method. It becomes an automatic call
        //create default constructor
//        My obj = new My();
        
        // create a parameterized constructor
        //My obj = new My(10);
        
        //Overloading constructor parameter
        My objInt = new My(10);
        My objDouble = new My(10.54);
        //obj.demo();
    }
    
}
