public class Kmethod {
    // メソッド
    // メソッドの内の変数はその中スコープ内でのみ有効
    // void はなにも返さない
    
    public static void sayHi(String name) {
        System.out.println("Hi! "+ name);
    }
    
    // overload
    
    public static void sayHi(){
        System.out.println("Hi! Nobody!");
    }    
    
    // 戻り値を返す際は、void->適したデータ型に
    // public static String sayHi(String name){
    //     return "Hi! " + name;
    // }
    
    public static void main(String args[]){
        sayHi();
        sayHi("Tom");
        
        // return
        // String msg = sayHi("Steve");
        // System.out.println(msg);
    }
}