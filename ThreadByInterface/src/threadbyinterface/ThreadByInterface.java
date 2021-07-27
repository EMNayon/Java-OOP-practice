
package threadbyinterface;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadByInterface {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
//        objA.run();
//        objB.run();
//        objA.start();
//        objB.start();
    
        Thread thread1 = new Thread(objA);
        thread1.start();
        Thread thread2 = new Thread(objB);
        thread2.start();
        // jdi class toiri korte na cai tahole sarasori o thread use korte pari ay vabe
        Thread thread3 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i<=10;i++){
                    try {
                        sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadByInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Hello");
                }
            }
        });
        thread3.start();
    
    }
    
}
// Runnable ekti interface
class A implements Runnable{
    //override.....
    public void run(){
        for(int i = 0; i<= 10; i++){
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("AA");
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i = 0; i<= 10; i++){
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("BB");
        }
    }
}