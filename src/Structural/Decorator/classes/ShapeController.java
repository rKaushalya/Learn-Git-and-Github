package Structural.Decorator.classes;

public abstract class ShapeController implements Shape{

    protected Shape decorator;

    public ShapeController (Shape decorator){
        this.decorator = decorator;
    }

    public void draw(){
        decorator.draw();
    }
}
