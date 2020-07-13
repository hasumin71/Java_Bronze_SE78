class Foo {
  private int num;
  int methodA() {
    return num;
  }
  public int methodB() {
    return num;
  }
}
class Test {
  public static void main(String[] args) {
    Foo foo = new Foo();
    foo.methodA();
    foo.methodB();
    System.out.println(foo.num);
  }
}
