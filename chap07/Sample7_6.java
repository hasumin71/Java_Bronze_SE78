class Super {
  public Super() { System.out.println("Super()"); } //２行目のコンストラクタが呼び出される。
  public Super(int a) { System.out.println("Super(int a)"); }
}
class Sub extends Super {
  public Sub() { System.out.println("Sub()"); }
  public Sub(int a) { System.out.println("Sub(super(a);)"); }
}
class Sample7_6 {
  public static void main(String[] args) {
    Sub s1 = new Sub(); //Subクラスの引数を持たないコンストラクタを呼び出しているが、
    Sub s2 = new Sub(10); //引数のあるコンストラクタを呼び出しているが
    //スーパークラス側で呼び出されるコンストラクタは２行目で定義された引数を持たないコンストラクタです。
    //これはプログラマが明示的に指定しないと、引数を持たないスーパークラスのコンストラクタ、
    //つまり、super()が呼び出される仕組みになっているからです。
  }
}

//出力結果
// Super() サブクラスを呼び出すとsuperクラスの最初のコンストラクタが呼び出される
// Sub() 次にサブクラスのコンストラクタが呼び出される。
// Super()
// Sub(int a)
