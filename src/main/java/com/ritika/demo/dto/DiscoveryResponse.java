package com.ritika.demo.dto;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DiscoveryResponse {
	@JsonProperty("page")
	private Integer page;
	@JsonProperty("results")
	public ArrayList<MovieResponse> results;
	@JsonProperty("total_pages")
	private Integer totalPages;
	@JsonProperty("total_results")
	private Integer totalResults;

}

