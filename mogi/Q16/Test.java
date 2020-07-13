class Test {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5};
    for (int x = 0; x < array1.length; x++) {
      System.out.print(array1[x] + " ");
      for (int y = 0; y < array2.length; y++) {
        System.out.print(array2[y] + " ");
      }
    }
  }
}
