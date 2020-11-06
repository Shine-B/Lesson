public class Sample_03_01_answer {

    static double total = 15;
    static double goal = 6;

    static double student = 500;
    static double men = 350;
    public static void main(String[] args){
        // 15回シュートしたら、そのうち6回ゴールに入った。
        System.out.println("15回中6回ゴールを決めた時の確率");
        System.out.println((goal / total) * 100);
        // 全校生徒 500 名のうち 350 名が男性
        System.out.println("全校生徒500人中350名の男性生徒の割合");
        System.out.println((men / student) * 100);
    }
}
