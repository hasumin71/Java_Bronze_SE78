class Test {
  int instanceVal = 100; //インスタンスメンバはそのクラスをインスタンスすると各オブジェクトの中に個々の領域として用意されます。
  static int staticVal = 200; //staticメンバは複数インスタンス化されても一箇所で領域が確保されます
  void methodA() { System.out.println("methodA(): " + instanceVal);}
  static void methodB() { //staticキーワードが指定されると、実行した際に領域の確保方法が変わります。
                    System.out.println("methodB(): " + staticVal);}
}
