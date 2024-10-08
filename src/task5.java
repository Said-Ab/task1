//import java.util.Scanner;
//
//public class task5 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int jup = 0;
//        int tak = 0;
//        while (num > 0&&num%2==0) {
//            if (num % 2 == 0) {
//                jup = num % 10;
//                System.out.print(" ," + jup);
//
//            }
//            num=num/10;
//
//        }
//        while (num>0&&num%2!=0){
//            if (num%2!=0){
//                tak=num%10;
//                System.out.println(" ,      "+tak);
//
//            }
//            num=num/10;
//        }
//    }
//}
import java.util.Scanner;

public class task5 {
    public static void main(String [] args){
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int a1 = a;
        int a2 = a;

        int count =1;
        while (a/10!=0){
            count++;
            a/=10;
        }
        int count2 =count;

        while (a1>0){
            count--;
            double b =Math.pow(10,count);
            double even = Math.floor(a1/b);
            if(even%2==0){
                System.out.printf("%.0f ",even);
            }
            a1%=b;
        }
        System.out.println("");

        while (a2>0){
            count2--;
            double b =Math.pow(10,count2);
            double odd =Math.floor(a2/b);
            if(odd%2!=0){
                System.out.printf("%.0f ",odd);
            }
            a2%=b;
        }

    }
}

