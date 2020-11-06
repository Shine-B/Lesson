import java.util.Random;

public class Sample_06_01{
    
    public static void main(String[] args) {
        omikuji();
    }

    public static void omikuji(){
        Random rand = new Random();
        int num = rand.nextInt(10);

        //‚à‚µ‚ànum‚ª5ˆÈ‰º‚¾‚Á‚½‚ç
        if(num <= 5){
            System.out.println("‘å‹g");

        //‚»‚¤‚Å‚È‚©‚Á‚½‚ç
        }else{
            System.out.println("‹¥");
        }
    }
}