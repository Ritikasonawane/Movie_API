package com.ritika.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ritika.demo.dto.DiscoverResponse;
import com.ritika.demo.service.MovieService;

@RestController
@RequestMapping("/movies")
public class UserController {

	@Autowired
	MovieService movieServiceImpl;

	@RequestMapping(value = "/byYearSearch", method = RequestMethod.GET)
	public DiscoverResponse getMovieByYear(@RequestParam Integer movieYear) {

		DiscoverResponse discoverResponseBean;

		discoverResponseBean = movieServiceImpl.fetchDiscoverDetailsByYear(movieYear);

		return discoverResponseBean;

	}

	@GetMapping("/topRatedMovies")
	public DiscoverResponse getTopRatedMovies() {

		DiscoverResponse discoverResponseBean;
		discoverResponseBean = movieServiceImpl.fetchTopRatedMovies();

		return discoverResponseBean;

	}

}
