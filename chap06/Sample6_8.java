class Sample6_8 {
  int instanceVal;             //�C���X�^���X�ϐ�
  static int staticVal;        //static �ϐ�

  int methodA() { return instanceVal; }           //�@ OK
  int methodB() { return staticVal; }             //�A OK
  //static int methodC() { return instanceVal; }  //�B NG
  static int methodD() { return staticVal; }      //�C OK
  static int methodE() {                          //�D OK
    Sample6_8 obj = new Sample6_8();
    return obj.instanceVal;
  }
}
