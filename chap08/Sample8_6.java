abstract class Foo {
  int x; int y;
  public abstract void print();
  public void method(int x, int y){ this.x = x; this.y = y; }
}
class MyClass extends Foo {
  public void print() {
    System.out.println("x : " + x + " y : " + y);
  }
}
class Sample8_6 {
  public static void main(String[] args) {
    
    Foo f = new MyClass();//myクラスをインスタンス化していますが、変数は抽象クラスの型で宣言している。
    f.method(10, 20);  
    f.print();    
  }
}
