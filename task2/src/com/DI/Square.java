package com.DI;

public class Square implements Shape {

    private Draw2d draw2d;
    private Draw2d draw3d;


    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }


    @Override
    public void draw() {
        draw2d.draw("square");
    }
}
