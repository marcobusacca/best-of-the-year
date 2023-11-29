package org.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.spring.pojo.Movie;
import org.java.spring.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

	@GetMapping("/")
	public String page1(Model model) {
		
		String name = "Marco";
		
		model.addAttribute("name", name);
		
		return "page1";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		
		List<Movie> movies = getBestMovies();
		
		model.addAttribute("movies", movies);
		
		return "movies";
	}
	@GetMapping("/songs")
	public String songs(Model model) {
		
		List<Song> songs = getBestSongs();
		
		model.addAttribute("songs", songs);
		
		return "songs";
	}
	
	@GetMapping("/movies/{id}")
	public String showMovie(Model model, @PathVariable int id) {
		
		Movie movie = null;
		
		for (Movie m : getBestMovies()) {
			
			if (m.getId() == id) {
				movie = m;	
			}
		}
		
		if (movie == null) {
			movie = new Movie(id, "movie not found");
		}
		
		model.addAttribute("movie", movie);
		
		return "show-movie";
	}
	@GetMapping("/songs/{id}")
	public String showSong(Model model, @PathVariable int id) {
		
		Song song = null;
		
		for (Song m : getBestSongs()) {
			
			if (m.getId() == id) {
				song = m;
			}
		}
		
		if (song == null) {
			song = new Song(id, "song not found");
		}
		
		model.addAttribute("song", song);
		
		return "show-song";
	}
	
	private List<Movie> getBestMovies(){
		
		List<Movie> movies = new ArrayList<>();
		
		Movie m1 = new Movie(1, "The First Slam Dunk");
		movies.add(m1);
		
		Movie m2 = new Movie(2, "Past Lives");
		movies.add(m2);
		
		Movie m3 = new Movie(3, "BlackBerry");
		movies.add(m3);
		
		Movie m4 = new Movie(4, "Rye Lane");
		movies.add(m4);
		
		Movie m5 = new Movie(5, "JoyLand");
		movies.add(m5);
		
		return movies;
	}
	private List<Song> getBestSongs(){
		
		List<Song> songs = new ArrayList<>();
		
		Song m1 = new Song(1, "Don’t Hate Me");
		songs.add(m1);
		
		Song m2 = new Song(2, "Lil Boo Thang");
		songs.add(m2);
		
		Song m3 = new Song(3, "Jealousy");
		songs.add(m3);
		
		Song m4 = new Song(4, "Sorry Not Sorry");
		songs.add(m4);
		
		Song m5 = new Song(5, "Not Strong Enough");
		songs.add(m5);
		
		return songs;
	}
}
