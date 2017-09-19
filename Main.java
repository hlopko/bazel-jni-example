public class Main {
  static {
    System.loadLibrary("libmain-jni");
  }

  private native int foo();

  public static void main(String[] args) {
    System.out.println(new Main().foo());
  }
}
