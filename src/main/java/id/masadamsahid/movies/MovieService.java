package id.masadamsahid.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        List<Movie> movies = movieRepository.findAll();
        System.out.println(movies);
        return movies;
    }
}
