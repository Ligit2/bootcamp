package week5.soldiersGame;

public class Dice {
    private int number;

    Dice(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    public void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == '0') System.out.print(" ");
                else System.out.print(aChar);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }


    public void show() {
        char[][][] Matrixs = {
                {{'0', '0', '0'}, {'0', '*', '0'}, {'0', '0', '0'}},
                {{'*', '0', '0'}, {'0', '0', '0'}, {'0', '0', '*'}},
                {{'0', '0', '*'}, {'0', '*', '0'}, {'*', '0', '0'}},
                {{'*', '0', '*'}, {'0', '0', '0'}, {'*', '0', '*'}},
                {{'*', '0', '*'}, {'0', '*', '0'}, {'*', '0', '*'}},
                {{'*', '0', '*'}, {'*', '0', '*'}, {'*', '0', '*'}}};

        printMatrix(Matrixs[number - 1]);
    }

}
