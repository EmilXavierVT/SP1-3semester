package app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    @JsonProperty("original_title")
    private String title;

    @JsonProperty("overview")
    private String overview;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("vote_average")
    private double rating;

    private Set<Genre> genre;

    private Set<Director> director;

    private Set<Actor> actor );
}
