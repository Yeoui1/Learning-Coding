import java.util.Scanner;

public class Solution7 {
        @SuppressWarnings("resource")
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while (sc.hasNextLine()) {
            t++;
            String input = sc.nextLine();
            System.out.println(t + " " + input);
        } 
    }
}
