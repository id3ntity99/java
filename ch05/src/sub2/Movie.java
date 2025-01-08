package sub2;

public class Movie {
  private String title;
  private String director;
  private double rating;
  private int availableSeats;

  public Movie(String title, String director, double rating, int availableSeats) {
    this.title = title;
    this.director = director;
    this.rating = rating;
    this.availableSeats = availableSeats;
  }

  public String getTitle() {
    return title;
  }


  public String getDirector() {
    return director;
  }

  public double getRating() {
    return rating;
  }

  public int getAvailableSeats() {
    return availableSeats;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public void setAvailableSeats(int availableSeats) {
    this.availableSeats = availableSeats;
  }

  public boolean reserveSeat() {
    if (this.availableSeats > 0) {
      availableSeats--;
      return true;
    }
    return false;
  }

  public void cancelReservation() {
    this.availableSeats++;
  }

  public void showDetails() {
    System.out.println("Title: " + this.title);
    System.out.println("Director: " + this.director);
    System.out.println("Rating: " + this.rating);
    System.out.println("Available Seats: " + this.availableSeats);
  }
}
