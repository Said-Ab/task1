import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int d = scanner.nextInt();
        while (e!=d){
            e=e+d;
            System.out.println(e);
            int t = scanner.nextInt();
            int i = scanner.nextInt();
            e=t;
            d=i;
        }
    }
}
