package com.ritika.demo.dto;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MovieResponse {
	@JsonProperty("adult")
	private boolean adult;

	@JsonProperty("backdrop_path")
	private String backdrop_path;

	@JsonProperty("genre_ids")
	public ArrayList<Integer> genre_ids;

	@Id
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("original_language")
	private String original_language;

	@JsonProperty("original_title")
	private String original_title;

	@JsonProperty("overview")
	private String overview;

	@JsonProperty("popularity")
	private double popularity;

	@JsonProperty("poster_path")
	private String poster_path;

	@JsonProperty("release_date")
	private String release_date;

	@JsonProperty("title")
	private String title;

	@JsonProperty("video")
	private boolean video;

	@JsonProperty("vote_average")
	private double vote_average;

	@JsonProperty("vote_count")
	private Integer vote_count;

}
