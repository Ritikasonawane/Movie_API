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

