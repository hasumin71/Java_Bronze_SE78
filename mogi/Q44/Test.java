class Test {
  public void foo() {
    bar();
    System.out.print("A ");
  }
  abstract void bar();
  public static void main(String[] args) {
    Test t = new Test();
    t.foo();
    System.out.print("B ");
  }
}
