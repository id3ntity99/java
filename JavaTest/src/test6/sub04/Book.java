package test6.sub04;

public class Book {
  private String title;
  private String author;
  private String isbn;
  private boolean isBorrowed;

  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isBorrowed = false;
  }

  public void borrowBook() {
    if (!isBorrowed)
      isBorrowed = true;
    else
      System.out.printf("%s 이미 대출됨\n", title);
  }

  public void returnBook() {
    if (isBorrowed) {
      isBorrowed = false;
      System.out.printf("도서반납: %s\n", title);
    }
  }

  public void getBookInfo() {
    String s = isBorrowed ? "불가능" : "가능";
    System.out.printf("도서명: %s\n저자: %s\nISBN:%s\n대출여부: %s\n", title, author, isbn, s);
  }

  public String getTitle() {
    return title;
  }
}
