package week2.day4;

public class cub {
    public static void main(String[] args) {
        int [][][] cub = new int[10][10][10];
        int sum = 0;
        int urishsum = 0;
        for (int i = 0; i < cub.length; i++) {
            for (int j = 0; j< cub[i].length; j++) {
                for (int k = 0; k < cub[i][j].length; k++) {
                    cub[i][j][k] =1;
                }
            }
        }
        for (int i = 0; i < cub.length; i++) {
                for (int k = 0; k < cub[i][0].length; k++) {
                    if(i+k>=cub[i][0].length-1)
                        sum +=cub[i][0][k];
                }
        }
        System.out.println(sum);
    }
}
