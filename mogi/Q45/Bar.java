class Foo {
  long m1(int var) { return 0; }
  long m2(int var, char c) { return 0; }
}
class Bar extends Foo {
  long m1(int var) { return 0; }
  int m1(char var) { return 0; }
  int m1(long var) { return 0; }
  public long m2(int var, char c) { return 0; }
  public long m2(char c, int var) { return 0; }
}
