package com.stereotypeannotations.stereotypeannotations.stereotype;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private int id;
    private String name;
    private String genre;
    private String director;

    public Movie(){
        super();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public double movieSimilarity(Movie movie1, Movie movie2){
        double similarity = 0.0;

        return similarity;
    }
}
