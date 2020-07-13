class Foo {
  String str = "Hello";
}
class Bar extends Foo {
  String str = "Bye";
}
class Test {
  public static void main(String[] args) {
    Foo obj1 = null;
    Bar obj2 = null;
    System.out.print(obj1.str + " ");
    System.out.print(obj2.str);
  }
}
