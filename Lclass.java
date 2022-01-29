class User {
  String name = "Me!"; // フィールド

  void sayHi() {
    System.out.println("hi!");
  }
}

public class Lclass {

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