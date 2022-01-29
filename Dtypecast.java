class Dtypecast {
    public static void main(String args[]){
        // データ型の型変換　キャスト
        // 変数名が被らないように注意
        double d = 123.123;
        int i = (int)d;
        System.out.println(i);
        
        int n = 10;
        double f = (double)n / 4;
        System.out.println(f);
    }
}