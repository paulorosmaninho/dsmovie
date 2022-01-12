package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {
	
	private Long id;
	private Double score;
	private Integer count;
	private String title;
	private String image;
	
	public MovieDTO() {
	}

	public MovieDTO(Long id, Double score, Integer count, String title, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	//Recebe Movie e popula MovieDTO
	public MovieDTO(Movie movie) {
		this.id = movie.getId();
		this.score = movie.getScore();
		this.count = movie.getCount();
		this.title = movie.getTitle();
		this.image = movie.getImage();
	}

	//Recebe um DTO e transforma em Movie
	public Movie transformToMovie() {
		return new Movie(null, score, count, title, image);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
