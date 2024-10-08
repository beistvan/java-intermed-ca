// Test imports
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
// File imports
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
// Possible exceptions to detect
import java.io.IOException;

public class TestExample {
  
  static File file;
  static FileWriter w;
  static Scanner s;

  @Before
  public void beforeEachTest() throws IOException {
    file = new File("test.txt");
    w = new FileWriter("test.txt");
    s = new Scanner(file);
  }

  @After
  public void afterEachTest() throws IOException {
    s.close();
  }

  @Test
  public void test1() throws IOException { 
    w.write("Testing testing 1 2 3!");
    w.close();  
    assertThat(s.nextLine(), equalTo("Testing testing 1 2 3!"));
  }

  @Test
  public void test2() throws IOException {    
    w.write("Poking poking 4 5 6!");
    w.close();
    assertThat(s.nextLine(), equalTo("Poking poking 4 5 6!"));
  }
}
/* Run:
export JUNIT4_CLASSPATH="/usr/share/java/junit4-4.12.jar:/usr/share/java/hamcrest-core-1.3.jar"
javac -cp .:$JUNIT4_CLASSPATH ./*.java
java -cp .:$JUNIT4_CLASSPATH org.junit.runner.JUnitCore TestExample
 */ 
