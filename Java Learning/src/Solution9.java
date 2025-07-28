import java.util.Calendar;
import java.util.Scanner;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance(); 
        calendar.set(year, month, day);
        int dayOfWeek = 0;
        String[] dia = {
            "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"
        };
        if (year > 2000 && year < 3000) {
            dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        }
        return dia[dayOfWeek - 1];
    }
}

public class Solution9 {
    @SuppressWarnings("resource")
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mes: ");
        int month = sc.nextInt();
        System.out.println("Introduce el dia: ");
        int day = sc.nextInt();
        System.out.println("Introduce el ano: ");
        int year = sc.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println(res.toUpperCase());
    }
} 