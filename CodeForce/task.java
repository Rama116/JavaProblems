import java.util.*;
public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();

        StringBuilder sb = new StringBuilder();
        for(char i : s.toCharArray()) {
            if(i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u' && i != 'y') {
                sb.append('.');
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
    }
}