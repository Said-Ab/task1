import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int length= scanner.nextInt();
        int[] arr=new int[length];
        for (int i = 0; i < arr.length ; i++) {
            int ran = random.nextInt(10,100);
            arr[i]= ran;
        }
        System.out.println(Arrays.toString(arr));
        for (int t = 0 ; t< arr.length;t++){
            if (arr[t]%2==0){
                System.out.print(arr[t]+",");
            }}
            System.out.println(" ");
            for (int j = 0 ; j< arr.length;j++){
                if (arr[j]%2!=0){
                    System.out.print(arr[j]+",");
                }
        }

        }
    }