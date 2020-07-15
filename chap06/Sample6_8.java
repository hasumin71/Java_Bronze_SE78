class Sample6_8 {
  int instanceVal;             
  static int staticVal;        

  int methodA() { return instanceVal; }          
  int methodB() { return staticVal; }           
  //static int methodC() { return instanceVal; }  
  static int methodD() { return staticVal; }      
  static int methodE() {                          
    Sample6_8 obj = new Sample6_8();
    return obj.instanceVal;
  }
}
