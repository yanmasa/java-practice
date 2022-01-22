public class User {
    
    String name; // クラスに属する変数　フィールド
    
    // constructor
    User(String name) {
        this.name = name;
    }
    User() {
        // this.name = "Me!";
        this("Me!");
    }
    void sayHi() {
        System.out.println("hi! "+ this.name);
    }

    public static void main(String[] args) {
    // int x;
    // String s;
    
    // Class
        User tom;
        tom = new User(); // インスタンス
        System.out.println(tom.name);
        tom.sayHi();
    }

}