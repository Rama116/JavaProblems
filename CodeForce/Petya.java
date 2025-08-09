import java.util.*;
public class Petya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        System.out.println(s1.compareTo(s2) < 0 ? -1 : s1.compareTo(s2) > 0 ? 1 : 0);
    }
}
