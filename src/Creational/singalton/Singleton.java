package Creational.singalton;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        return singleton == null ? new Singleton() : singleton;
    }
}
