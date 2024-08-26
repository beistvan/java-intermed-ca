import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Ignore;

import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class JUnitExample {
  int a;

  @Before
  public void beforeTest() {
    a = 10;
  }

  @Test
  public void test() {
    assertThat(a, equalTo(10));
  }

  @Ignore
  public void ignoredTest() {
    assertThat(a, equalTo(50));
  }

  @After
  public void afterTest() {
    a = 0;
  }
}
/* Run tests
$ export JUNIT4_CLASSPATH="/usr/share/java/junit4-4.12.jar:/usr/share/java/hamcrest-core-1.3.jar"
$ javac -cp .:$JUNIT4_CLASSPATH ./*.java
$ java -cp .:$JUNIT4_CLASSPATH org.junit.runner.JUnitCore JUnitExample
*/
