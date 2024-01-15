package com.ritika.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ritika.demo.dto.DiscoverResponse;
import com.ritika.demo.service.MovieService;

@Service("MovieServiceImpl")
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	RestTemplate restTemplate;
	

	@Override
	public DiscoverResponse fetchDiscoverDetailsByYear(Integer movieYear) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.themoviedb.org/3/");
		String primaryReleaseYear = builder.path("discover/movie")
				.queryParam("api_key", "016fe97483a235a2c1b75bce3028f7b7")
				.queryParam("primary_release_year", movieYear)
				.build().toString();
		System.out.println("primaryReleaseYear" + primaryReleaseYear);
		
		ResponseEntity<DiscoverResponse>movieResponseEntity=
		restTemplate.getForEntity(primaryReleaseYear, DiscoverResponse.class);
		
		DiscoverResponse responseBeanArray = movieResponseEntity.getBody();
	
		
		return responseBeanArray;
	}
	@Override
	public DiscoverResponse fetchTopRatedMovies() {
	    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.themoviedb.org/3/");
	    String topRatedMoviesUrl = builder.path("movie/top_rated")
	          .queryParam("api_key", "016fe97483a235a2c1b75bce3028f7b7")
	          .build().toString();

	    ResponseEntity<DiscoverResponse>movieResponseEntity=
	          restTemplate.getForEntity(topRatedMoviesUrl, DiscoverResponse.class);

	    DiscoverResponse responseBeanArray = movieResponseEntity.getBody();


	    return responseBeanArray;
	}

}
