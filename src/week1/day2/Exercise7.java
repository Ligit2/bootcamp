package week1.day2;

import java.util.Scanner;

//Write a java program to calculate the square of a
//-right-angled triangle
//         -square
//         -rectangle
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tEdge1 = scanner.nextInt();
        int tEdge2 = scanner.nextInt();
        int tSquare = tEdge1 * tEdge2 / 2;
        System.out.println(tSquare);
        int sEdge = scanner.nextInt();
        int sSquere = sEdge * sEdge;
        System.out.println(sSquere);
        int rEdge1 = scanner.nextInt();
        int rEdge2 = scanner.nextInt();
        int rSquere = rEdge1 * rEdge2;
        System.out.println(rSquere);
    }
}
