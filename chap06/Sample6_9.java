class Employee {
  //インスタンス変数にprivate修飾子を指定
  private int id;

  //コンストラクタにpublic修飾子を指定
  public Employee(int i) { id = i; }

  //メソッドにpublic修飾子を指定
  public int getId() { return id; }
}

public class Sample6_9 {
  public static void main(String[] args) {
    Employee emp = new Employee(100);

    //private 指定されたメンバは、他クラスからアクセス不可
    //System.out.println(
    // "private 指定のインスタンス変数へアクセス : " + emp.id);

    //public指定されたメンバは、他クラスからアクセス可
    System.out.println(
    "public指定のメソッドへアクセス : " + emp.getId());
  }
}
