package beanScops;

public class Square implements Shape{
    Draw2d  draw2d;
    Draw3d  draw3d;
    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }
    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }
    @Override
    public void draw() {
        draw2d.draw("square");
    }

}
