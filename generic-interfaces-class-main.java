public class Main {
  public static void main(String[] args) {
    int myNumber = 24;
    String bookName = "Hello Book!";
    // Enter your code below...
    Retriever<Integer> containerRetriever = new Container<>(myNumber);
    Retriever<String> bookRetriever = new Book(bookName);
    System.out.println(containerRetriever.retrieveData());
    System.out.println(bookRetriever.retrieveData());
  }
}
