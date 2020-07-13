interface Player {
  void play();
  void stop();
}
abstract class DVDPlayer implements Player {
  public void play() { }
  public abstract void stop();
}
