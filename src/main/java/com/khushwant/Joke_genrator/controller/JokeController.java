package com.khushwant.Joke_genrator.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khushwant.Joke_genrator.entity.Joke;
import com.khushwant.Joke_genrator.service.JokeService;

@RestController
@RequestMapping("/joke/v1")
public class JokeController {

	private final JokeService service;

	public JokeController(JokeService service) {
		this.service = service;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Joke joke) {
		joke.setJokeLength(joke.getJoke().length());
		boolean saveJoke = service.saveJoke(joke);
		
		if(!saveJoke) {
			return new ResponseEntity("Please provide complete joke, Not empty!", HttpStatus.BAD_REQUEST);
		}
		
		return ResponseEntity.ok("Provided joke is being stored in our joke gallery");
	} 
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Joke>> getAll() {
		List<Joke> allJokes = service.getAllJokes();

		return ResponseEntity.ok(allJokes);
		
	} 
	
	
	
	
}
