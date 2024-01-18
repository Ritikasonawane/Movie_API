package com.ritika.demo.service.imp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.ritika.demo.dto.DiscoveryResponse;
import com.ritika.demo.exception.MovieNotFoundException;
import com.ritika.demo.moviecontroller.MovieController;
import com.ritika.demo.service.MovieService;

@Service("MovieServiceImpl")
public class MovieServiceImplementation implements MovieService {
	Logger logger = LoggerFactory.getLogger(MovieController.class);

	static UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.themoviedb.org/3/");

	final RestTemplate restTemplate;

	public MovieServiceImplementation(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public DiscoveryResponse fetchDiscoverDetailsByYear(Integer movieYear) {

		String primaryReleaseYear = builder.path("discover/movie")
				.queryParam("api_key", "016fe97483a235a2c1b75bce3028f7b7").queryParam("primary_release_year", movieYear)
				.build().toString();
		System.out.println("primaryReleaseYear" + primaryReleaseYear);
		DiscoveryResponse responseBeanArray = null;
		ResponseEntity<DiscoveryResponse> movieResponseEntity;
		try {
			movieResponseEntity = restTemplate.getForEntity(primaryReleaseYear, DiscoveryResponse.class);
			responseBeanArray = movieResponseEntity.getBody();
		} catch (RestClientException e) {
			throw new MovieNotFoundException("We can't fetch movie for year " + movieYear);

		}
		if (responseBeanArray == null) {
			throw new MovieNotFoundException("Movies couldn't be fetched for year " + movieYear);
		}

		return responseBeanArray;
	}

	@Override
	public DiscoveryResponse fetchTopRatedMovies() {
		String topRatedMoviesUrl = builder.path("movie/top_rated")
				.queryParam("api_key", "016fe97483a235a2c1b75bce3028f7b7").build().toString();
		DiscoveryResponse responseBeanArray = null;
		try {
			ResponseEntity<DiscoveryResponse> movieResponseEntity = restTemplate.getForEntity(topRatedMoviesUrl,
					DiscoveryResponse.class);
			responseBeanArray = movieResponseEntity.getBody();
		} catch (Exception e) {
			logger.error(e.getMessage());
			// e.printStackTrace();
		}
		return responseBeanArray;
	}

}
