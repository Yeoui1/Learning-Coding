import java.util.*;

public class Solution {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sol2(args);
    }
    public static void sol2(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                int a = scanner.nextInt();
                System.out.println(a);
            }
        }
    }
}