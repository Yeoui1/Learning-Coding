import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1 = sc.next();
                int x = sc.nextInt();
                String s2 = s1.trim();
                DecimalFormat df = new DecimalFormat("000");
                String x1 = df.format(x);
                for (int j = s2.length(); j < 15; j++) {
                    s2 = s2 + " ";
                }
                System.out.println(s2 + x1);
            }
            sc.close();
            System.out.println("================================");
    }
}
