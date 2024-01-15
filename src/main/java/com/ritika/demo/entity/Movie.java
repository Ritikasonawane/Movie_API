package com.ritika.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "mov_name" )
	private String mov_name;
	@Column(name = "mov_director")
	private  String mov_director;
	@Column(name = "movieyear")
	private Integer yearOfPublish;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMov_name() {
		return mov_name;
	}
	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}
	public String getMov_director() {
		return mov_director;
	}
	public void setMov_director(String mov_director) {
		this.mov_director = mov_director;
	}
	public Integer getyearOfPublish() {
		return yearOfPublish;
	}
	public void setyearOfPublish(Integer yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	
	
	
}
