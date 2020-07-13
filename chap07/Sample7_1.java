class Employee {  //スーパークラス
  private String id = "100";
  public String getId() {
    return id;
  }
}
class Sales extends Employee {  //サブクラス
  private String clientName = "SE";
  public String getClientName() {
    return clientName;
  }
}
class Sample7_1 {  //サブクラスを利用しているクラス
  public static void main(String[] args) {
    Sales s = new Sales();  
    System.out.println("clientName : " + s.getClientName());
    System.out.println("id         : " + s.getId());
  }
}
