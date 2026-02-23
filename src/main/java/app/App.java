package app;


import app.services.MovieService;
import app.utils.ApiFetcher;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void initiate()
    {
    MovieService movieService = new MovieService();
    movieService.getDanishMovies();

    }
}
