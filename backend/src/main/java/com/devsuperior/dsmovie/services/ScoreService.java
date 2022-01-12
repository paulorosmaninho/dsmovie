package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired 
	MovieRepository movieRepository;
	
	@Autowired 
	UserRepository userRepository;

	@Autowired 
	ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO scoreDTO) {
		
		User user = userRepository.findByEmail(scoreDTO.getEmail());
		
		//Salva o usuário se não existir
		//O método saveAndFlush libera a alteração na base
		if(user == null) {
			user = new User();
			user.setEmail(scoreDTO.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		//Utiliza o método get() no final para não acrescentar o Optional
		Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();

		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setScore(scoreDTO.getScore());
		
		//Salva Score e retorna o resultado atualizado com saveAndFlush
		score = scoreRepository.saveAndFlush(score);
		
		
		double sum = 0.0;
		
		//movie.getScores() traz a lista de scores de um determinado filme
		//O for percorre essa lista obtendo as avaliações de cada usuário,
		//soma e depois calcula a média pelo tamanho do array de avaliações 
		for (Score s : movie.getScores()) {
			sum = sum + s.getScore();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		//Salva os dados atualizados na tabela Movie
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
		
	}
	
		

}
