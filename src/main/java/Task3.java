import java.util.Locale;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter time in minutes elapsed since the beginning of the hour: ");

        double t = scanner.nextDouble();
        double cycleTime = t % 5;

        String color = (cycleTime < 3) ? "green" : ( cycleTime < 4) ? "yellow" : "red";

        System.out.println(color);
        scanner.close();
    }
}
