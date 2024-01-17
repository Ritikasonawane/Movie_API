package com.ritika.demo.service;

import com.ritika.demo.dto.DiscoverResponse;

public interface MovieService {
	public DiscoverResponse fetchDiscoverDetailsByYear(Integer movieYear);
	public DiscoverResponse fetchTopRatedMovies();
}
