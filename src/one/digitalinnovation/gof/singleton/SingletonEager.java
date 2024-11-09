package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author AlexandreGarciaJr
 */
public class SingletonEager {
    private static SingletonEager instancia;

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
