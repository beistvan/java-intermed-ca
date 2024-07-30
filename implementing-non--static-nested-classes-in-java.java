class Lib {
  String objType;
  String objName;

  // Assign values using constructor
  public Lib(String type, String name) {
    this.objType = type;
    this.objName = name;
  }

  // private method
  private String getObjName() {
    return this.objName;
  }

  // Inner class
  class Book {
    String description;

    void setDescription() {
      if(Lib.this.objType.equals("book")) {
        if(Lib.this.getObjName().equals("nonfiction")) {
          this.description = "Factual stories/accounts based on true events.";
        } else {
          this.description = "Literature that is imaginary.";
        }
      } else {
        this.description = "Not a book!";
        }
    }
    String getDescription() {
      return this.description;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Lib fiction = new Lib("book", "fiction");
    Lib.Book bookF = fiction.new Book();
    bookF.setDescription();
    System.out.println("Fiction Book Description = " + bookF.getDescription());

    Lib nonFiction = new Lib("book", "nonfiction");
    Lib.Book bookN = nonFiction.new Book();
    bookN.setDescription();
    System.out.println("Non-fiction Book Description = " + bookN.getDescription());
  }
}

