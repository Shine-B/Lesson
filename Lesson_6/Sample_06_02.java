import java.util.Random;

public class Sample_06_02{
    
    public static void main(String[] args) {
        omikuji();
    }

    public static void omikuji(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        //������num��3�ȉ���������
        if(num <= 3){
            System.out.println("��g");
        //�����łȂ��A������num��6�ȉ���������
        }else if(num <= 6){
            System.out.println("���g");
        //��L�̂ǂ�ɂ����Ă͂܂�Ȃ�������B
        }else if(num <= 9){
            System.out.println("��");

        }
    }
}