package com.stereotypeannotations.stereotypeannotations.stereotype;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Making this as a bean via spring so that it will get selected
@Service
public class RecommendedMovieImplemenation {


    //private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Filterr filter;

    public RecommendedMovieImplemenation(){}

    public RecommendedMovieImplemenation(Filterr filter){
        this.filter = filter;
    }

    public Filterr getFilter(){
        return filter;
    }

    public void setFilter(Filterr filter){
        this.filter = filter;
    }

    /*
    // Constructor Injection (Autowiring + Injecting)
    public RecommendedMovieImplemenation(@Qualifier("CF") Filterr filter){
        this.filter = filter;
    }
    */


    //public RecommendedMovieImplemenation(Filterr filter){
    //    this.filter = filter;
    //}

    public String[] recommendedMovie(String movie){
        System.out.println("Checking the filter names in usage : "+ filter+"\n");
        String[] resultMovies = filter.getRecommendatins(movie);

        return resultMovies;
    }
}

// Recommendationmovie --has--> filter as dependency
// contentfiltering implements filter -->
