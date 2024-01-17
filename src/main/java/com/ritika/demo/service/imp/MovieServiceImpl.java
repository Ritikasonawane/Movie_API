package com.ritika.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.ritika.demo.controller.UserController;
import com.ritika.demo.dto.DiscoverResponse;
import com.ritika.demo.exception.MoviNotFoundException;
import com.ritika.demo.repository.UserRepository;
import com.ritika.demo.service.MovieService;

@Service("MovieServiceImpl")
public class MovieServiceImpl implements MovieService {
	Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	RestTemplate restTemplate;

	@Override
	public DiscoverResponse fetchDiscoverDetailsByYear(Integer movieYear) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.themoviedb.org/3/");
		String primaryReleaseYear = builder.path("discover/movie")
				.queryParam("api_key", "016fe97483a235a2c1b75bce3028f7b7").queryParam("primary_release_year", movieYear)
				.build().toString();
		System.out.println("primaryReleaseYear" + primaryReleaseYear);
		DiscoverResponse responseBeanArray = null;
		ResponseEntity<DiscoverResponse> movieResponseEntity;
		try {
			movieResponseEntity = restTemplate.getForEntity(primaryReleaseYear, DiscoverResponse.class);
			responseBeanArray = movieResponseEntity.getBody();
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			throw new MoviNotFoundException("We can't fetch movie for year " + movieYear);

		}
		/*
		 * if(responseBeanArray == null) { throw new
		 * MoviNotFoundException("Movies couldn't be fetched for year " + movieYear); }
		 */
		return responseBeanArray;
	}

	@Override
	public DiscoverResponse fetchTopRatedMovies() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.themoviedb.org/3/");
		String topRatedMoviesUrl = builder.path("movie/top_rated")
				.queryParam("api_key", "016fe97483a235a2c1b75bce3028f7b7").build().toString();
		DiscoverResponse responseBeanArray = null;
		try {
			ResponseEntity<DiscoverResponse> movieResponseEntity = restTemplate.getForEntity(topRatedMoviesUrl,
					DiscoverResponse.class);
			responseBeanArray = movieResponseEntity.getBody();
		} catch (Exception e) {
			logger.error(e.getMessage());
			// e.printStackTrace();
		}
		return responseBeanArray;
	}

}
