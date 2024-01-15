package com.ritika.demo.dto;
import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data 

public class DiscoverResponse {

	@JsonProperty("page")
	private Integer page;
	@JsonProperty("results")
	public ArrayList<MovieResponse> results;
	@JsonProperty("total_pages")
	private Integer total_pages;
	@JsonProperty("total_results")
	private Integer total_results;
	
	
	
}


/*
public class Result{
    public boolean adult;
    public String backdrop_path;
    public ArrayList<int> genre_ids;
    public int id;
    public String original_language;
    public String original_title;
    public String overview;
    public double popularity;
    public String poster_path;
    public String release_date;
    public String title;
    public boolean video;
    public double vote_average;
    public int vote_count;
}



*/