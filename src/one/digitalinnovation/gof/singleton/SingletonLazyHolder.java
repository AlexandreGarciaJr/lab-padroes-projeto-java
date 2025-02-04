package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @author AlexandreGarciaJr
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
