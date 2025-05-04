package com.khushwant.Joke_genrator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khushwant.Joke_genrator.entity.Joke;

@Repository
public interface JokeRepository extends JpaRepository<Joke, Integer> {


}
