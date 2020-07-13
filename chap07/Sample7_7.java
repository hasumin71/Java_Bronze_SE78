class Super {
  public Super() { System.out.println("Super()"); }
  public Super(int a) { System.out.println("Super(int a)"); }
}
class Sub extends Super {
  public Sub() { System.out.println("Sub()"); }
  public Sub(int a) {
    super(a); //ここを経由してsuperクラスが呼び出されている。
    System.out.println("Sub(int a)"); }
}
class Sample7_7 {
  public static void main(String[] args) {
    Sub s1 = new Sub();
    Sub s2 = new Sub(10);
  }
}

// //実行結果
// Super()
// Sub()
// Super(int a)
// Sub(int a)
