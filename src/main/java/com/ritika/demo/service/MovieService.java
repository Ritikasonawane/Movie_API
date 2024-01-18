package com.ritika.demo.service;

import com.ritika.demo.dto.DiscoveryResponse;

public interface MovieService {
	public DiscoveryResponse fetchDiscoverDetailsByYear(Integer movieYear);
	public DiscoveryResponse fetchTopRatedMovies();
}
