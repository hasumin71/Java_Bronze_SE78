class Super {
  int num;
    public void methodA() { num += 100; }
    public void print() { System.out.println("num 値 :" + num); }
    }
    class Sub extends Super {
    public void methodA() { num += 500; } //num +=100 をオーバースライドしている
    public void methodB(int num) {
    methodA(); //methodAを呼び出しているが、Superクラスで定義したmethodA()をSubクラス側でオーバーライドしているため、7行目が呼び出される。
    print(); //この呼び出しによる出力は500となる
    super.methodA(); //しかし、３行目が呼び出される、従って出力は600になる //親クラスを指定してるので、オーバースライドしない
    print(); 
    }
    }
    class Sample7_5 {
    public static void main(String[] args) {
    Sub s = new Sub(); //ここでsubクラスをインスタンス化
    s.methodB(0); //8行目のmethodBを呼び出している
  }
}
