import java.time.DayOfWeek;
import java.time.LocalDate;

public class Solution9Alternative {
    public static void main(String[] args) {
        int year = 2015;
        int month = 8; // July (1-based here!)
        int day = 5;

        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("Day of week: " + dayOfWeek); // Outputs MONDAY, TUESDAY, etc.
        System.out.println("Day as number: " + dayOfWeek.getValue()); // 1 = Monday, 7 = Sunday
    }
}
