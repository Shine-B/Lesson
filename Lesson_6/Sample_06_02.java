import java.util.Random;

public class Sample_06_02{
    
    public static void main(String[] args) {
        omikuji();
    }

    public static void omikuji(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        //‚à‚µ‚ànum‚ª3ˆÈ‰º‚¾‚Á‚½‚ç
        if(num <= 3){
            System.out.println("‘å‹g");
        //‚»‚¤‚Å‚È‚­A‚à‚µ‚ànum‚ª6ˆÈ‰º‚¾‚Á‚½‚ç
        }else if(num <= 6){
            System.out.println("’†‹g");
        //ã‹L‚Ì‚Ç‚ê‚É‚à“–‚Ä‚Í‚Ü‚ç‚È‚©‚Á‚½‚çB
        }else if(num <= 9){
            System.out.println("‹¥");

        }
    }
}