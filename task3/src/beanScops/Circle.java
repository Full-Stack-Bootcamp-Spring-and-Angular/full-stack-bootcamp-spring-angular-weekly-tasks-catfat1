package beanScops;

public class Circle implements Shape{
    Draw2d  draw2d;
    Draw3d  draw3d;

    public Circle(Draw3d draw3d, Draw2d draw2d) {
        this.draw3d = draw3d;
        this.draw2d = draw2d;
    }
    public void draw() {
        draw2d.draw("circle");
    }

}
