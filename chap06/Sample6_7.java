class Sample6_7 {
  public static void main(String[] args) {
    //System.out.println(Test.instanceVal);      
    System.out.println(Test.staticVal);          
    //Test.methodA();                            
    Test.methodB();                              
    System.out.println("-------------------");
    Test t = new Test();
    System.out.println(t.instanceVal);           
    System.out.println(t.staticVal);            
    t.methodA();                               
    t.methodB();                               
  }
}
