class Iarray {
    public static void main(String args[]){
        // 配列
        // sale1, sale2, ...　=> sales
        int[] sales;
        sales = new int[3];
        sales[0] = 100;
        sales[1] = 200;
        sales[2] = 300;
        
        // 別の書き方1
        // int[] sales;
        // sales = new int[] {100, 200, 300};
        
        // 別の書き方２
        // int[] sales = {100, 200, 300};
        
        
        // for (int i =0; i<sales.length; i++){
        //     System.out.println(sales[i]);
        // }
        
        // 配列に対するfor
        for(int sale : sales){
            System.out.println(sale);
        }
        
    }
}