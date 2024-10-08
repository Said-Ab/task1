import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int length= scanner.nextInt();
        int[] arr=new int[length];
        int y= arr.length/2;
        for (int i = 0; i < arr.length ; i++) {
            int ran = random.nextInt(10,100);
            arr[i]= ran;
        }
        System.out.println(Arrays.toString(arr));
        for (int t = 0;t<y;t++){
            if (t!= arr.length){
                System.out.print(arr[t]+",");

            }}
            System.out.println(" ");
            for (;y< arr.length;y++){
                if (y!= args.length){
                    System.out.print(arr[y]+",");
                }
        }
    }
}
