
package threadbyinheritance;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadByInheritance {
    public static void main(String[] args) {
       A objA = new A();
       B objB = new B();
 
//       objA.run();
//       objB.run();
//I will call the object the start() method
       objA.start();
       objB.start();
    }
    
}

class A extends Thread{
    //When we extend the thread, we will define the building method called run of the thread class.
    public void run(){
        for(int i=0; i<=10; i++){
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("AA");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("BB");
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
