import java.util.*;
public class Theatre_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();


        long r = ((n + a - 1) / a) * ((m + a - 1) / a);
        System.out.println(r);
    }   
}
