interface MyInterface {
  
  int b = 10;
  final int c = 20;
  public int d = 30;
  static int e = 40;
  public final int f = 50;

  public abstract void methodA();
  abstract void methodB();
  void methodC();
  //protected abstract void methodD(); //protected 
}
class MyClass implements MyInterface {
  public void methodA(){}
  public void methodB(){}
  public void methodC(){}
}
