package Structural.Decorator;

import Structural.Decorator.classes.Circal;
import Structural.Decorator.classes.Rectangle;
import Structural.Decorator.classes.RedShapeDecorator;
import Structural.Decorator.classes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circal();
        Shape redCircle = new RedShapeDecorator(new Circal());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
