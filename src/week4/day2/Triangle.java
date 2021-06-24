package week4.day2;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    Triangle() {
    }

    Triangle(int sideA, int sideB, int sideC) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSizeC(sideC);
    }

    private boolean isTriangleValid() {
        if (sideA + sideC > sideB && sideB + sideC > sideA && sideA + sideB > sideC)
            return true;
        else
            return false;
    }

    private int right() {
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2))
            return sideC;
        if (Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2))
            return sideA;
        if (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2))
            return sideB;
        else
            return -1;
    }

    public double check() {
        if (isTriangleValid()) {
            if (right() != -1) {
                if (right() == sideC)
                    return (double) (sideB * sideA) / 2;
                if (right() == sideB)
                    return (double) (sideC * sideA) / 2;
                if (right() == sideA)
                    return (double) (sideB * sideC) / 2;
            } else {
                return (double) sideA + sideB + sideC;
            }
        }
        return -1;
    }

    public void check(Triangle triangle) {
        if (triangle.isTriangleValid())
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is invalid");
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSizeC() {
        return sideC;
    }

    public void setSideA(int sideA) {
        if (sideA >= 1 && sideA <= 20)
            this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        if (sideB >= 1 && sideA <= 20)
            this.sideB = sideB;
    }

    public void setSizeC(int sideC) {
        if (sideC >= 1 && sideC <= 20)
            this.sideC = sideC;
    }
}
