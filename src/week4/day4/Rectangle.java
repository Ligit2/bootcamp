package week4.day4;

public class Rectangle implements Shape{
    private double edge1;
    private double edge2;
    public Rectangle(double edge1, double edge2){
        this.edge1=edge1;
        this.edge2=edge2;
    }
    @Override
    public double square() {
        return edge2*edge1;
    }

    @Override
    public double perimeter() {
        return 2*edge2 + 2*edge1;
    }
}
