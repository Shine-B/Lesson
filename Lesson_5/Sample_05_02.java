public class Sample_05_02 {

    public static void main(String[] args) {
        // メインメソッド内で自作のメソッド呼び出し動的に出力結果を変更する。
        myFunction_add(300,550);
    }

    // 自作のメソッド(int型の変数valueA , int型の変数valueB)
    public static void myFunction_add(int velueA,int valueB) {
        // 引数で受けたvalueAとvalueBを足し算し、その結果をint型の変数resultに代入する。
        int result =  velueA + valueB;
        // resultの結果を表示する。
        System.out.println(result);
    }
}