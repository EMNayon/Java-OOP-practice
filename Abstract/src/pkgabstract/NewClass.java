
package pkgabstract;

// abstract class
//If I give the abstract in front of the class, I will not be able to create any more objects of that class.
// But if we create and extend another class then we can implement this class 
abstract class NewClass {
    void demo(){
        System.out.println("We can implement abstract class with other helping class");
    }
}
// helping class
class Help extends NewClass{ // Now we can implement NewClass{}.
    
}

abstract class NewClass1 {
    //There are no body parts in the abstract class
    // If you want to implement abstract method, you have to override that method
    abstract void demo();
}

// helping class......
class Help1 extends NewClass1{ // Now we can implement NewClass{} class.
    //Override....
    void demo(){
        System.out.println("We can implement abstract method with override method");
    }
}
