class Sample3_13 {
  public static void main(String[] args) {
    int num = 3;

    switch (num) {
      case 1:
      case 2:
        System.out.println("1 �܂��� 2 ");  // num�l��1��2�̏ꍇ�̏���
        break;
      case 3:
      case 4:
        System.out.println("3 �܂��� 4 ");  // num�l��3��4�̏ꍇ�̏���
        break;
      default:
        System.out.println("default");// num�l��1����4�ȊO�̏ꍇ�̏���
    }
  }
}
