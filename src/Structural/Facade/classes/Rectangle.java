package Structural.Facade.classes;

public class Rectangle implements Stage {
    @Override
    public void draw() {
        System.out.println("Rectangle called.!");
    }
}
