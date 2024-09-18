import org.junit.Test;

import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestExample {
  Example ex = new Example();

  @Test
  public void testFactorial() {
    assertThat(ex.factorial(4), equalTo(24));
    assertThat(ex.factorial(5), equalTo(120));
    assertThat(ex.factorial(1), equalTo(1));
    assertThat(ex.factorial(0), equalTo(1));
  }
}
// Complie and run
//export JUNIT4_CLASSPATH="/usr/share/java/junit4-4.12.jar:/usr/share/java/hamcrest-core-1.3.jar"
//javac -cp .:$JUNIT4_CLASSPATH ./*.java
//java -cp .:$JUNIT4_CLASSPATH org.junit.runner.JUnitCore TestExample
