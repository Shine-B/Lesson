import java.util.Random;

public class Sample_06_01{
    
    public static void main(String[] args) {
        omikuji();
    }

    public static void omikuji(){
        Random rand = new Random();
        int num = rand.nextInt(10);

        //もしもnumが5以下だったら
        if(num <= 5){
            System.out.println("大吉");

        //そうでなかったら
        }else{
            System.out.println("凶");
        }
    }
}