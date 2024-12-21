package creational.singleton;

/**
 * Using static object.
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){};
    private static Singleton2 getInstance(){
        return singleton2;
    }
}
