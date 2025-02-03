package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import entity.Movie;
import internal.Prompt;
import service.MoviesService;

public class MoviesController {
  private static final Logger LOGGER = Logger.getLogger(MoviesController.class.getName());
  private final MoviesService service = MoviesService.getInstance();

  public MoviesController() {
    // Empty constructor
  }

  private void print(Movie movie) {
    String msg = String.format("Movie ID: %d%nTitle:%s%nGenre:%s%nRelease Date:%s%n",
        movie.getMovieId(), movie.getTitle(), movie.getGenre(), movie.getReleaseDate());
    System.out.println(msg);
  }

  private Movie getNewMovie(Prompt prompt, Scanner sc) {
    Movie movie = new Movie();

    prompt.ask("Movie ID");
    int movieId = sc.nextInt();
    movie.setMovieId(movieId);

    prompt.ask("Title: ");
    String title = sc.nextLine();
    movie.setTitle(title);

    prompt.ask("Genre: ");
    String genre = sc.nextLine();
    movie.setGenre(genre);

    prompt.ask("Release Date");
    String releaseDate = sc.nextLine();
    movie.setReleaseDate(releaseDate);

    return movie;
  }

  public void run(Scanner sc) {
    String title = "Movie Management";
    String[] options = {"Go Back", "Add new Movie", "Search By Name", "Search By ID", "List Movies",
        "Update Info", "Delete Movie"};
    String inSymbol = ">>";
    Prompt prompt = new Prompt(title, options, inSymbol);

    prompt.printTitle();
    while (true) {
      prompt.printOptions();
      prompt.printInputSymbol();

      int choice = sc.nextInt();

      switch (choice) {
        case 1: {// Go back to AppMain
          return;
        }

        case 2: {
          Movie movie = getNewMovie(prompt, sc);
          try {
            service.enroll(movie);
          } catch (SQLException e) {
            String msg = String.format("[Search Failed] %s", e.getMessage());
            LOGGER.severe(msg);
          }
          break;
        }

        case 3: {// Search movie with name
          String name = sc.nextLine();
          try {
            Movie movie = service.search(name);
            print(movie);
          } catch (SQLException e) {
            String msg = String.format("[Search Failed] %s", e.getMessage());
            LOGGER.severe(msg);
          }
          break;
        }

        case 4: {// Search movie with ID
          String movieId = sc.nextLine();
          try {
            Movie movie = service.search(movieId);
            print(movie);
          } catch (SQLException e) {
            String msg = String.format("[Search Failed] %s", e.getMessage());
            LOGGER.severe(msg);
          }
          break;
        }

        case 5: {// List all movies
          try {
            List<Movie> movies = service.getMovies();
          } catch (SQLException e) {
            String msg = String.format("[List Failed] %s", e.getMessage());
            LOGGER.severe(msg);
          }
        }

        case 6: {// Update movie information
          Movie movie = getNewMovie(prompt, sc);
        }

        case 7: {// Delete movie information from DB

        }

        default: {
          break;
        }
      }
    }
  }
}
