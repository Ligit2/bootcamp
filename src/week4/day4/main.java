package week4.day4;

public class main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Rectangle(10, 3);
        shape[1] = new Circle(3);
        shape[2] = new Square(4);
        for (int i = 0; i < 3; i++) {
            System.out.println(shape[i].perimeter() + " "+shape[i].square());
        }
    }
}
