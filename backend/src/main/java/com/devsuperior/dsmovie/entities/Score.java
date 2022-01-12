package com.devsuperior.dsmovie.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.dsmovie.entities.pk.ScorePK;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	@Column(name = "score", precision = 11, scale = 2)
	private Double score;
	
	
	public Score() {
	}


	public Score(User user, Movie movie, Double score) {
		id.setUser(user);
		id.setMovie(movie);
		this.score = score;
	}


	public User getUser() {
		return id.getUser();
	}


	public void setUser(User user) {
		id.setUser(user);
	}

	public Movie getMovie() {
		return id.getMovie();
	}
	
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	

	public Double getScore() {
		return score;
	}


	public void setScore(Double score) {
		this.score = score;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, score);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(id, other.id) && Objects.equals(score, other.score);
	}
	
}
