import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        while (scan>0){
            System.out.print(scan%10);
            scan=scan/10;
        }
    }
}
