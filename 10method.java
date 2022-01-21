public class メソッド {
    // メソッド
    // void はなにも返さない
    
    // public static void sayHi(String name) {
    //     System.out.println("Hi! "+ name);
    // }
    
    // 戻り値を返す際は、void->適したデータ型に
    
    public static String sayHi(String name){
        return "Hi! " + name;
    }
    
    public static void main(String args[]){
        // sayHi();
        // sayHi("Tom");
        String msg = sayHi("Steve");
        System.out.println(msg);
    }
}