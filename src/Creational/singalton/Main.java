package Creational.singalton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println("Object addresses is = "+singleton1+" : "+singleton2);
    }
}
