abstract class X {                //抽象クラス
  protected abstract void methodA();
}
abstract class Y extends X { }    //抽象クラス
class Z extends Y {               //具象クラス
  public void methodA(){}
}
