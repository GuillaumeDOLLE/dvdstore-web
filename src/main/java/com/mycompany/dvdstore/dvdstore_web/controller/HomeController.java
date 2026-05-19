package com.mycompany.dvdstore.dvdstore_web.controller;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/dvdstore-home")
    public @ModelAttribute("movies") List<Movie> displayHome() {
        System.out.println("La méthode display Home a été invoquée");
        List<Movie> movies = movieService.getMovieList();
        return movies;
    }
}
