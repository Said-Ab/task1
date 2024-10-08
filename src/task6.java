import java.util.Scanner;

public class task6 {
    public static void main(String [] args){
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int a1=a;
        int i = 0;
        double first =0;
        for (; a >0; i++) {
            a/=10;
        }
        double c=Math.pow(10,i-1);
        first=Math.floor(a1/c);
        System.out.printf("%.0f",first);
    }
}