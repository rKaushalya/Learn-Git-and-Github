package Behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);

        System.out.println("First State Change 15");
        subject.setState(15);
        System.out.println();
        System.out.println("First State Change 10");
        subject.setState(10);
    }
}
