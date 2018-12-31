package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("Beans.xml");
		Movie movie =  (Movie) appcontext.getBean("movie");
		Movie movie1 = (Movie) appcontext.getBean("movie1");
		
		System.out.println("----------- Movie Details ------------");
		System.out.println("Movie ID 	: " + movie.getMovieId());
		System.out.println("Movie Name 	: " + movie.getMovieName());
		System.out.println("Movie Actor : " + movie.getMovieActor()); 
		
		System.out.println("----------- Movie Details ------------");
		System.out.println("Movie ID 	: " + movie1.getMovieId());
		System.out.println("Movie Name 	: " + movie1.getMovieName());
		System.out.println("Movie Actor : " + movie1.getMovieActor());
	}

}
