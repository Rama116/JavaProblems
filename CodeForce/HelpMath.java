import java.util.*;
public class HelpMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\+");
        List<Integer> list = new ArrayList<>();
        for (String i : arr) {
            if (!i.isEmpty()) {
                list.add(Integer.parseInt(i));
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i : list)
            sb.append(i + "+");
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
