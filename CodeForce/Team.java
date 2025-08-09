import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] arr = new int[n][3];
        for(int i = 0 ; i < n ; i++) {
            int o = 0;
            for(int j = 0 ; j < 3 ; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1)
                    o++;
            }
            if(o > 1)
                count++;
        }
        System.out.println(count);
    }
}
