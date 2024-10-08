import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean check = true;
        int fnum=0;
        for (int i = 0; i<20;i++){
            int nums = random.nextInt(1,100);
            if (check==true){
                fnum=nums;
                check=false;
            }
            if (nums%fnum==0){
                System.out.println(nums);
            }
        }
        }
        }


