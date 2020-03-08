import java.io.IOException;
public class TestException extends Exception {
    public TestException() {
        super();
    }
    public TestException(String s) {
        super(s);
    }
  public static void main(String[] args) {
    TestException t = new TestException();
     try {
       t.throw1();
     } catch (IOException ex) {
       System.out.println("An IOException has occurred");
     }
  }

    public void throw1() throws IOException {
    throw new IOException();
  }
}
