class Foo {
  String s; int i;
  public Foo() { //1８行目の呼び出しでここのコンストラクタが呼び出される
    this("Hello"); //helloを引数として6行目を呼び出している
  }
  public Foo(String s) {
    this(s, 1); //引数で受け取ったhelloと１をひきすうとして、９行目のコンストラクタを呼び出している
  }
  public Foo(String s, int i) { //呼ばれてHelloと１が出力される。
    this.s = s; this.i = i;
    System.out.println("String : " + this.s);
    System.out.println("int    : " + this.i);
  }
}
class Sample7_4 {
  public static void main(String[] args) {
    System.out.println("Foo()呼び出し-----------------");
    Foo f1 = new Foo();
    System.out.println("Foo(\"Hey\")呼び出し------------");
    Foo f2 = new Foo("Hey");
    System.out.println("Foo(\"Bye\", 200)呼び出し-------");
    Foo f3 = new Foo("Bye", 200);
  }
}
