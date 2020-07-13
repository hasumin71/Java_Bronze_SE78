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

//問６−１6
class Test{
  public static void main(String[] args){ //stringのあとに[]をつけないとコンパイルエラー 
    int num;                              //voidをつけているので戻り値を返さない
    num = 10;
    calc(num);
    System.out.println("num = " + num);
  }
  static void calc(int num){
    num += 100; //ここの値は変数に代入されない
  }
}