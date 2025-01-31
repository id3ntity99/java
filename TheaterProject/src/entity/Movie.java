package entity;

public class Movie {
  private int movieId;
  private String title;
  private String genre;
  private String releaseDate;

  public Movie() {
    // Empty constructor. Use getters and setters
  }

  public Movie(int movieId, String title, String genre, String releaseDate) {
    this.movieId = movieId;
    this.title = title;
    this.genre = genre;
    this.releaseDate = releaseDate;
  }

  public int getMovieId() {
    return movieId;
  }

  public void setMovieId(int movieId) {
    this.movieId = movieId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public String toString() {
    return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", releaseDate="
        + releaseDate + "]";
  }
}
