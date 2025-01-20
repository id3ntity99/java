package sub3;

public class Count {
  private int num; // This attr will be shared between threads.

  public int getNum() {
    return num;
  }

  public synchronized void incrementNum() {// Use Mutex(Mutual Exclusive) to resolve race condtion.
    num++;
  }
}
