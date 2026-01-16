import java.util.Scanner;

public class Solution3 {
        @SuppressWarnings("ConvertToTryWithResources")
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i = scan.nextInt();
        System.out.println("Enter a double:");
        double d = scan.nextDouble();
        System.out.println("Enter a string:");
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
