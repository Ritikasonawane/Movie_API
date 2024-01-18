package com.ritika.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DiscoveryDetails {
	@JsonProperty("language")
	private String language;

	@JsonProperty("sort_by")
	private String sortBy;

	@JsonProperty("primary_release_year")
	private Integer primaryReleaseYear;

}
