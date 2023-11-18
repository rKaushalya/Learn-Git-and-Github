package Structural.Facade;

import Structural.Facade.classes.Cercul;
import Structural.Facade.classes.Rectangle;
import Structural.Facade.classes.Stage;

public class FacadeImpl {
    private Stage circle;

    private Stage rectangle;

    public FacadeImpl(){
        circle = new Cercul();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
