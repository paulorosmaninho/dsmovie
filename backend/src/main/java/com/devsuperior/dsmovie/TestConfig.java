package com.devsuperior.dsmovie;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	ScoreRepository scoreRepository;


	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null,"maria@email.com");
		User u2 = new User(null,"joao@email.com");
		User u3 = new User(null,"ana@email.com");
		User u4 = new User(null,"lucia@email.com");
		User u5 = new User(null,"joaquim@email.com");

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));

		Movie m01 = new Movie(null, 4.5, 2, "The Witcher", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg");
		Movie m02 = new Movie(null, 3.3, 3, "Venom: Tempo de Carnificina", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/vIgyYkXkg6NC2whRbYjBD7eb3Er.jpg");
		Movie m03 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m04 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m05 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m06 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m07 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m08 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m09 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m10 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m11 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m12 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m13 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m14 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m15 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m16 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m17 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m18 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m19 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m20 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m21 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m22 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m23 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m24 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m25 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m26 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m27 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m28 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");
		Movie m29 = new Movie(null, 0D, 0, "Shang-Chi e a Lenda dos Dez Anéis", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/cinER0ESG0eJ49kXlExM0MEWGxW.jpg");
		Movie m30 = new Movie(null, 0D, 0, "Matrix Resurrections", "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg");		

		
		movieRepository.saveAll(Arrays.asList(
				m01, m02, m03, m04, m05, m06, m07, m08, m09, m10,
				m11, m12, m13, m14, m15, m16, m17, m18, m19, m20,
				m21, m22, m23, m24, m25, m26, m27, m28, m29, m30));
		

		Score s1 = new Score(u1, m01, 5.0);
		Score s2 = new Score(u1, m02, 4.0);
		Score s3 = new Score(u2, m01, 3.0);
		Score s4 = new Score(u2, m02, 3.0);
		Score s5 = new Score(u2, m03, 4.0);
				
		scoreRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5));
		
	}

}
