import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число от 1 до 99");
        int a = scanner.nextInt();
        int[]num=new int[20];
        for(int i=0;i< num.length;i++){
            num[i]= random.nextInt(1,100);
            if (num[i]%a==0){
                System.out.println(num[i]);
            }

        }
        System.out.println(" ");
        System.out.println(Arrays.toString(num));
    }
}
