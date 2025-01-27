package test6.sub04;

public class Member {
  private String name;
  private String memberId;
  private Book borrowedBook;

  public Member(String name, String memberId) {
    this.name = name;
    this.memberId = memberId;
    this.borrowedBook = null;
  }

  public void borrowBook(Book book) {
    this.borrowedBook = book;
    borrowedBook.borrowBook();
    System.out.printf("도서 대출: %s\n", borrowedBook.getTitle());
  }

  public void returnBook(Book book) {
    this.borrowedBook.returnBook();
    this.borrowedBook = null;
  }

  public void getMemberInfo() {
    String s = borrowedBook != null ? borrowedBook.getTitle() : "없음";
    System.out.printf("회원명: %s%n아이디:%s\n대출한 도서: %s\n", name, memberId, s);
  }
}
