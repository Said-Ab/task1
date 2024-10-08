import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = scanner.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(1000, 10000);

        }
        System.out.println(Arrays.toString(b));
        for (int j = a - 1; j >= 0; j--) {
            if (j != 0) {
                System.out.print(b[j] + ",");
            } else {
                System.out.print(b[j]);
            }
        }
    }
}
