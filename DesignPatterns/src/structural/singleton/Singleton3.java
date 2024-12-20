package structural.singleton;

/**
 * Using Synchronized method for thread protection
 */
public class Singleton3 {
    private static Singleton3 singleton2;
    private Singleton3(){};
    private synchronized static Singleton3 getInstance(){
        if(singleton2==null){
            singleton2 = new Singleton3();
        }
        return singleton2;
    }
}
