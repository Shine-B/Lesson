class Sample_05{

    public static void main(String[] args){
        //メインメソッド内で自作のメソッド呼び出し
        myFunction("こんにちは、私の名前は社員Bです。");
        myFunction("カッコ内の文字を変更することで、");
        myFunction("プロンプトに表示される結果が変わります。");
    }

    //自作のメソッド(引数にはストリング型の text という変数を使用することを明示している。)
    public static void myFunction(String text){
        //引数で受けたテキストをプロンプトに表示する。
        System.out.println(text);
    }
}
