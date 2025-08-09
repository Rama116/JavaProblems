import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int c1 = 0 , c2 = 0;
        for(int i = 0 ; i < 5; i++) {
            for(int j = 0 ; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1) {
                    c1 = i;
                    c2 = j;
                }
            }
        }
        System.out.println(Math.abs(2 - c1) + Math.abs(2 - c2));
    }
}
