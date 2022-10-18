
import java.util.Scanner;

public class Windchill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for t temperature (Farenheit) and v (mph): ");
        int t = scanner.nextInt();
        int v = scanner.nextInt();

        int t1 = 0;
        if (v < 3 && v > 120) {
            t1 = 1;

        }
        if (t <= 50 && t1 != 1) {
            float w = (float) (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
            System.out.println("Answer is " + w);
        } else {
            System.out.println("Value of t should be less than 50 and value of v cant be less than 3 and more than 120");
        }
    }
}
