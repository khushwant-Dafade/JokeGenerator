package com.khushwant.Joke_genrator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Joke {

	@Id
	@GeneratedValue
	private Integer id;
	private String joke;
	private String author;
	private Integer jokeLength;
	
	
	public Joke() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joke(Integer id, String joke, String author) {
		super();
		this.id = id;
		this.joke = joke;
		this.author = author;
		this.jokeLength = joke.length();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJoke() {
		return joke;
	}
	public void setJoke(String joke) {
		this.joke = joke;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getJokeLength() {
		return jokeLength;
	}
	public void setJokeLength(Integer jokeLength) {
		this.jokeLength = jokeLength;
	}
	@Override
	public String toString() {
		return "Joke [id=" + id + ", joke=" + joke + ", author=" + author + ", jokeLength=" + jokeLength + "]";
	}


}
