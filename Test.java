// 問６−１８
// class Test {
//   static String lang = "C";
//   public String operation = "Unix";
//   Test(){}
//   Test(String str){
//     operation = str;
//   }
//   public static void main(String args[]){
//     Test obj1 = new Test("Solaris"); //インスタンス生成 それぞれの領域
//     Test obj2 = new Test(); 
//     obj1.lang = "Java"; //変数を書き換え
//     System.out.println(obj1.lang+"¥t"+obj1.operation);
//     System.out.println(obj2.lang+"¥t"+obj2.operation);
//   }
// }

// // 問６−１7
// class Test {
//   static int num;
//    void methodA() {num++;} //このメソッドがstaticじゃないからコンパイルエラー
//   static void methodB() {num++;}
//   public static void main(String[] args){
//     methodA(); methodB();
//     System.out.println(num);
//   }
// }

// //問６−１6
// class Test{
//   public static void main(String[] args){ //stringのあとに[]をつけないとコンパイルエラー 
//     int num;                              //voidをつけているので戻り値を返さない
//     num = 10;
//     calc(num);
//     System.out.println("num = " + num);
//   }
//   static void calc(int num){
//     num += 100; //ここの値は変数に代入されない
//   }
// }

//問６−１5
// class Test{
//   private static int a; //値は0
//   private int b;
//   public static int methodA(){
//     return ++a; 
//   }
//   public int methodB(){
//     return methodA();
//   }
//   public static void main(String[] args){
//     Test obj = new Test();
//     System.out.print(obj.methodB() + " ");
//     System.out.print(obj.methodA());
//   }
// }

//問7-4
// class X {
//   static int val;
// }
// class A extends X {
//   A() { val++; }
// }
// class B extends X {
//   B() { val++; }
// }
// class Test {
//   public static void main(String[] args) {
//     new A(); new B();
//     System.out.println(X.val);
//   }
// }

//7-6
// class A {
//   static int num = 0;
//   A() { num++; } //Aコンストラクタが呼び出されると２行目のstatic変数であるnum変数がインクリメントされます。
// }
// class B extends A {
//   int num = 10;
//   B() { num++; } //B()コンストラクタが呼び出されると,6行目のインスタンス変数であるnum変数がインクリメントされます。
// }
// class Test {
//   public static void main(String[] args) {
//     A a1 = new A(); A a2 = new A(); A a3 = new A(); //
//     B b1 = new B(); B b2 = new B(); B b3 = new B();
//     A[] valA = {a1, a2, a3};
//     B[] valB = {b1, b2, b3};
//     for( B obj : valB){ System.out.print(obj.num + " ");} 
//   }
// }

// //7-8
// public class Test {
//   private String name;
//   public Test(){this("fern");}
//   public Test(String name){ this.name = name;}
//   public String getName() { return name; }
// }

// public class Tree extends Test {
//   public void growFruit(){}
//   public void dropLeaves(){}
// }

//8-9
interface I {
  void func();
}
class A implements I {
  public void func(){ System.out.println("A "); }
}
class B extends A{
  public void func(){ System.out.println("B ");}
}
class Test {
  public static void main(String[] args){
    I obj = new B();
    obj.func();
  }
}