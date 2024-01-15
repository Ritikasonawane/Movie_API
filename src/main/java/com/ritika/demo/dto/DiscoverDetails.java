package com.ritika.demo.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data 

public class DiscoverDetails {
  @JsonProperty("language")
  private String language;
  
  @JsonProperty("sort_by")
  private String sort_by;
  
  @JsonProperty("primary_release_year")
  private Integer primary_release_year;

	
}
