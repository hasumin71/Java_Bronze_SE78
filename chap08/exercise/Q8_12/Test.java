class A { }
class B extends A { }
class Test {
  public static void main(String[] args) {
    A a = new A();
    B b = (B)a;
  }
}
