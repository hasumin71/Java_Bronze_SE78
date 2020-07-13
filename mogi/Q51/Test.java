interface I {
  void func();
}
class A implements I {
  public void func() { System.out.println("A "); }
}
class B extends A {
  public void func() { System.out.print("B "); }
  public void method() { System.out.print("C "); }
}
class Test {
  public static void main(String[] args) {
    I obj;
    A a = new A();
    B b = new B();
    obj = b;
    obj.func();
    b.method();
  }
}
