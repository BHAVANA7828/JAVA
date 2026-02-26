import java.util.Scanner;
public class year {
    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int N = sc.nextInt();
        boolean leap = isLeap(year);
        // Print Leap/Common year
        if (leap)
            System.out.println("Leap Year");
        else
            System.out.println("Common Year");

        // Check valid day
        int maxDays = leap ? 366 : 365;
        if (N < 1 || N > maxDays) {
            System.out.println("Invalid Day");
            return;
        }
        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
        int index = (N - 1) % 7;
        System.out.println(days[index]);
    }
}
