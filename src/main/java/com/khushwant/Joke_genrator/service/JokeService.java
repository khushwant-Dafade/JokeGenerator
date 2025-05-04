package com.khushwant.Joke_genrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khushwant.Joke_genrator.entity.Joke;
import com.khushwant.Joke_genrator.repository.JokeRepository;

@Service
public class JokeService {

	@Autowired
	private JokeRepository repo;
	
	
	public boolean saveJoke(Joke joke) {
		if(joke.getJoke().length() > 0) {
			repo.save(joke);
			return true;
		}
		return false;
	}
	
	
	public List<Joke> getAllJokes() {
		if(repo.count() > 0) {
			return repo.findAll();
		}
		return null;
	}
	
	
	
}
