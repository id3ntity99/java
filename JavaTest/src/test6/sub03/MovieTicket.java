package test6.sub03;

public class MovieTicket {
  private String movieTitle;
  private String screenTime;
  private String seatNumber;
  private boolean isBooked;

  public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
    this.movieTitle = movieTitle;
    this.screenTime = screenTime;
    this.seatNumber = seatNumber;
    this.isBooked = false;
  }

  public void bookTicket() {
    if (!isBooked)
      isBooked = true;
    else
      System.out.println("이미 예매됨");

  }

  public void cancelBooking() {
    if (isBooked)
      isBooked = false;
    else
      System.out.println("아직 예약 안됨");
  }

  public void printTicketInfo() {
    System.out.printf("영화제목: %s\n상영시간: %s\n좌석번호: %s\n예매여부: %s\n", movieTitle, screenTime,
        seatNumber, isBooked ? "Yes" : "No");
  }
}
