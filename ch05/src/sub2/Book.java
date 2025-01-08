package sub2;

public class Book {
  private String title;
  private String author;
  private String isbn;
  private int availableCopies;

  public Book(String title, String author, String isbn, int availableCopies) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.availableCopies = availableCopies;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public int getAvailableCopies() {
    return availableCopies;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setAvailableCopies(int availableCopies) {
    this.availableCopies = availableCopies;
  }

  public boolean borrowBook() {
    if (this.availableCopies > 0) {
      availableCopies--;
      return true;
    }
    return false;
  }

  public void returnBook() {
    this.availableCopies++;
  }

  public void show() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + isbn);
    System.out.println("Available Copies: " + availableCopies);
  }
}
