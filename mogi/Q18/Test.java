class Test {
  public static void main(String[] args) {
    char[] val = {'x', 'y', 'z'};
    for (int i = 0; i < 2; i++) {
      for (char c : val) {
        System.out.print(val[i]);
      }
    }
  }
}
