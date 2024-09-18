public class Example {
  // Constructor
  public Example() {
  }

  public int factorial(int n) {
    // Magic code
    return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); 
  }
}
