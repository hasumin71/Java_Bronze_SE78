class Sample3_12 {
  public static void main(String[] args) {
    int num = 2;
    switch (num) {
        // num�̒l��1�̏ꍇ�̏���
      case 1:
        System.out.println("num�̒l��1�ł��B");
        break;     // break�ɂ��switch���甲����
        // num�̒l��2�̏ꍇ�̏���
      case 2:
        System.out.println("num�̒l��2�ł��B");
        // break�����Ȃ����߁A����default�̏����������s
        // num�̒l��1�ȊO�̏ꍇ�̈ȉ������s�����
      default:
        System.out.println("default�ł��B");
    }
  }
}
