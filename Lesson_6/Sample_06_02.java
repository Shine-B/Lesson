import java.util.Random;

public class Sample_06_02{
    
    public static void main(String[] args) {
        omikuji();
    }

    public static void omikuji(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        //もしもnumが3以下だったら
        if(num <= 3){
            System.out.println("大吉");
        //そうでなく、もしもnumが6以下だったら
        }else if(num <= 6){
            System.out.println("中吉");
        //上記のどれにも当てはまらなかったら。
        }else if(num <= 9){
            System.out.println("凶");

        }
    }
}