class Foo {
  public void method() {
    System.out.println("Hello");
  }
}
class Bar extends Foo {
  public void method() {
    System.out.println("Bye");
  }
}
class Test {
  public static void main(String[] args) {
    Foo foo = new Foo();
    Bar bar = (Bar)foo;
    bar.method();
  }
}
