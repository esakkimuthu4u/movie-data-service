package io.javalearn.moviedataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javalearn.moviedataservice.models.Rating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}
	
	@RequestMapping("/user/{userId}")
	public List<Rating> getUserRating(@PathVariable("userId") String userId) {
		return Arrays.asList(new Rating("1234",4),new Rating("4567",3));
	}
}
