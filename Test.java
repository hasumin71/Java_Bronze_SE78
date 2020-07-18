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

// //8-9
// interface I {
//   void func();
// }
// class A implements I {
//   public void func(){ System.out.println("A "); }
// }
// class B extends A{
//   public void func(){ System.out.println("B ");}
// }
// class Test {
//   public static void main(String[] args){
//     I obj = new B();
//     obj.func();
//   }
// }

//8-10
// class Foo {
//   String name;
// }
// class Bar extends Foo {
//   Bar(String name) {
//     this.name = name;
//   }
//   void show() {
//     System.out.pirntln(name);
//   }
//   public static void main(String[] args){
//     Foo obj= new Bar("hana");
//   }
// }

//16
// class Test {
//   public static void main(String[] args){
//     int[] array1 = {1,2,3};
//     int[] array2 = {4,5};
//     for (int x = 0; x < array1.length; x++){
//       System.out.print(array1[x]+ " ");
//       for(int y = 0; y < array2.length; y++){
//         System.out.print(array2[y] + " ");
//       }
//     }
//   }
// }

//17
// class Test {
//   public static void main(String[] args){ //初めから判定がfalseでも
//     for(int i = 5; i < i++; i++){
//       System.out.println("Hi");
//     }
//   }
// }

//18
// class Test {
//   public static void main(String[] args){
//     char[] val = {'x', 'y', 'z'};
//     for(int i = 0; i < 2; i++){
//       for(char c : val){
//         System.out.print(val[i]);
//       }
//     }
//   }
// }

//19
// class Test {
//   public static void main(String[] args){
//     for(int i= 1; i < 5; i++){
//       if(i==2){ continue; }
//       System.out.println(" i = " + i);
//     }
//   }
// }

//20
// class Test {
//   public static void main(String[] args) {
//     for(int i = 1; i < 5; i++){
//       if(i == 2){ break;}
//       System.out.print(" i= " + i );
//     }
//   }
// }

//21
// class Test {
//   public static void main(String[] args) {
//     String[] str = new String[3];
//     str[0] = "JP";
//     str[1] = null; //nullリテラルを明示的に代入しても問題ない
//     str[2] = "US";
//     for(int i = 1; i<str.length; i++){
//       System.out.println(str[i] + " ");
//     }
//   }
// }  

//22 
// class Test{
//   public static void main(String[] args){
//     char[] array = {'a','b','c'};
//     for(int i = 0; i < array.length; i++){
//       System.out.print(i + " ");
//       switch (array[i]){
//         case 'a': System.out.print("a ");
//         case 'b': System.out.print("b ");
//         case 'c': System.out.print("c ");
//       }
//     }
//   }
// }

//30
// class Test {
//   public static void main(String[] args){
//     System.out.println("data : " + args[2] + args[3]);
//   }
//   public static void main(char[] args){
//     System.out.print("data = " + args[2] + args[3]);
//   }
// }

//42;
// class Foo {
//   String str = "Hello";
// }
// class Bar extends Foo {
//   String str = "Bye";
// }
// class Test {
//   public static void main(String[] args){
//     Foo obj1 = null;
//     Bar obj2 = null;
//     System.out.print(obj1.str + " ");
//     System.out.print(obj2.str +);
//   }
// }

//44
// class Test {
//   public void foo(){
//     bar();
//     System.out.print("A ");
//   }
//   abstract void bar();
//   public static void main(String[] args){
//     Test t = new Test();
//     t.foo();
//     System.out.print("B ");
//   }
// }