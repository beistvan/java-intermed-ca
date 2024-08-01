class Book {
	// Nested inner class
  String type = "Nonfiction";
	class Biography {
    String type = "Biography";

    public void print() {
      System.out.println(type); // prints "string_2"
      System.out.println(Book.this.type); // prints "string_1"
    }
	}
}

public class Books {
	public static void main(String[] args) {
		Book book = new Book();
		Book.Biography bio = book.new Biography();
		bio.print();
	}
}

