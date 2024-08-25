package design_patterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
