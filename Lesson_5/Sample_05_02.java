public class Sample_05_02 {

    public static void main(String[] args) {
        // ���C�����\�b�h���Ŏ���̃��\�b�h�Ăяo�����I�ɏo�͌��ʂ�ύX����B
        myFunction_add(300,550);
    }

    // ����̃��\�b�h(int�^�̕ϐ�valueA , int�^�̕ϐ�valueB)
    public static void myFunction_add(int velueA,int valueB) {
        // �����Ŏ󂯂�valueA��valueB�𑫂��Z���A���̌��ʂ�int�^�̕ϐ�result�ɑ������B
        int result =  velueA + valueB;
        // result�̌��ʂ�\������B
        System.out.println(result);
    }
}