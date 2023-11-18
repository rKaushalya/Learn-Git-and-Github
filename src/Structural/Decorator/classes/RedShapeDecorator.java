package Structural.Decorator.classes;

public class RedShapeDecorator extends ShapeController{
    public RedShapeDecorator(Shape decorator) {
        super(decorator);
    }

    @Override
    public void draw(){
        decorator.draw();
        setRedShape(decorator);
    }

    public void setRedShape(Shape redShape){
        System.out.println("Border Clear.!");
    }


}
