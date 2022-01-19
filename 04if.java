class 条件分岐 {
    public static void main(String args[]){
        // 条=件分岐 if
        // 比較演算子　> >= < <= == != 
        // 論理演算子 && || !
        int score = 85;
        // if(score > 80){
        //     System.out.println("Great!");
        // } else if (score > 60 ){
        //     System.out.println("Good!");
        // }else {
        //     System.out.println("so so ..!");
        // }
        
        String msg = score > 80 ? "Great!" : "so so ... !";
        System.out.println(msg);
    }
}