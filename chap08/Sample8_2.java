abstract class X {                //���ۃN���X
  protected abstract void methodA();
}
abstract class Y extends X { }    //���ۃN���X
class Z extends Y {               //��ۃN���X
  public void methodA(){}
}
