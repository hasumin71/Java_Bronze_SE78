// 問６−１８
class Test {
  static String lang = "C";
  public String operation = "Unix";
  Test(){}
  Test(String str){
    operation = str;
  }
  public static void main(String args[]){
    Test obj1 = new Test("Solaris"); //インスタンス生成 それぞれの領域
    Test obj2 = new Test(); 
    obj1.lang = "Java"; //変数を書き換え
    System.out.println(obj1.lang+"¥t"+obj1.operation);
    System.out.println(obj2.lang+"¥t"+obj2.operation);
  }
}