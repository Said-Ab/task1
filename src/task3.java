import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        while (X>0){
            int i= scanner.nextInt();
            X=X-i;
        }
        System.out.println(X);
    }
}
