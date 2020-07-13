interface I1 { void foo(); }
interface I2 { void bar(); }
class A implements I1 {
  public void foo(){ System.out.println("foo"); }
}
class B extends A implements I2 {
  public void bar() { System.out.println("bar"); }
  public static void main(String args[]) {
    A a = new B();
    I2 obj = (I2)a;
    obj.bar();
  }
}
