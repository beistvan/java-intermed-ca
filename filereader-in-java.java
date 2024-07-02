import java.io.FileReader;
import java.io.IOException;

public class Introduction {
  public static void main(String[] args) throws IOException {
    String path = "./input.txt";
    FileReader input = new FileReader(path);
    int counterVar = 0;
    while((counterVar = input.read()) != -1) {
      System.out.print((char)counterVar);
    }
    input.close();
  }
}
