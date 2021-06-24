package week4.day4;

public class Square implements Shape{
    private double length;
    public Square(double length){
        this.length=length;
    }
    @Override
    public double square() {
        return length*length;
    }

    @Override
    public double perimeter() {
        return 4*length;
    }
}
