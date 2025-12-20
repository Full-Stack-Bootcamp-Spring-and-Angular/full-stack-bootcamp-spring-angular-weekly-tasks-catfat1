public class Square implements Shape{
    private double side;

    public void setSide(double side){
        this.side=side;
    }

    @Override
     public double getArea() {
        return side * side;
    }
}
