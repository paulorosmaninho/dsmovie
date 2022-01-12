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
	
	@Column(name = "value", precision = 11, scale = 2)
	private Double value;
	
	
	public Score() {
	}


	public Score(User user, Movie movie, Double value) {
		id.setUser(user);
		id.setMovie(movie);
		this.value = value;
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
	

	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

}