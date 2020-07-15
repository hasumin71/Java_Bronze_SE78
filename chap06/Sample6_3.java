class Test {
  void myPrint(){ System.out.println("myPrint()"); }
  void myPrint(int a) { System.out.println("myPrint(int a)"); } //
  void myPrint(int a, int b){
                        System.out.println("myPrint(int a, int b)"); } //引数の数が異なるのでok
  void myPrint(String s) {
                        System.out.println("myPrint(String s)"); } //引数の型が異なるのでok
}
class Sample6_3 {
  public static void main(String[] args) {
    
    Test t = new Test();
    t.myPrint();
    t.myPrint(100);
    t.myPrint(100, 200);
    t.myPrint("yamamoto");
  }
}

//結果
// myPrint()
// myPrint(int a)
// myPrint(int a, int b)
// myPrint(String s)
