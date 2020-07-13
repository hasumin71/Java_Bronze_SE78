class Super {
  void method() {
    System.out.println("Super");
  }
}
class Sub extends Super {
  static void method() {
    System.out.println("Sub");
  }
}
class Test {
  public static void main(String[] args) {
    Sub obj = new Sub();
    obj.method();
  }
}
