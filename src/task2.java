import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean sm = true;
        boolean bi = true;
        int s = 0;
        int b = 0;
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(-50, 50);
            System.out.print(r + ",");
            if (sm == true) {
                s = r;
                sm = false;
            }
            if (bi==true){
                b=r;
                bi=false;
            }
            if (b>r){
                b=r;
            }
            if (s < r) {
                s = r;
            }

        }
        System.out.println(" ");
        System.out.println(s);
        System.out.println(b);
    }
}
