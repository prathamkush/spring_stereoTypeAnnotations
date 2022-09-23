package com.stereotypeannotations.stereotypeannotations;

import com.stereotypeannotations.stereotypeannotations.stereotype.RecommendedMovieImplemenation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/*

@Component

*/



@SpringBootApplication
public class StereotypeannotationsApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(StereotypeannotationsApplication.class);

		RecommendedMovieImplemenation recommender = appContext.getBean(RecommendedMovieImplemenation.class);

		System.out.println(Arrays.toString(recommender.recommendedMovie("matrix")));


	}

}
