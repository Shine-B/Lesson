import java.util.Random;

public class Sample_06_01{
    
    public static void main(String[] args) {
        omikuji();
    }

    public static void omikuji(){
        Random rand = new Random();
        int num = rand.nextInt(10);

        //������num��5�ȉ���������
        if(num <= 5){
            System.out.println("��g");

        //�����łȂ�������
        }else{
            System.out.println("��");
        }
    }
}