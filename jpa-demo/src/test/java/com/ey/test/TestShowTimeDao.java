package com.ey.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.dao.ShowTimeDao;
import com.ey.entity.Movie;
import com.ey.entity.Multiplex;

public class TestShowTimeDao {

	private static ShowTimeDao dao;

	@BeforeAll
	public static void init() {
		dao = new ShowTimeDao();
	}

	@Test
	public void testAddMovie() {
		Movie mov = new Movie();
		mov.setMovId(69);
		mov.setTitle("Zumanji");
		dao.addMovie(mov);
	}
	
	@Test
	public void testAddMultiplex() {
		Multiplex mux = new Multiplex();
		mux.setMpexId(30);
		mux.setName("Laxmi");
		dao.addMultiplex(mux);
	}
	@Test
	public void TestAddMovieToMuliplex() {
		dao.addMovieToMultilpex(69, 30);
	}
	
	@Test
	public void TestRemoveMovie() {
		dao.removeMovie(69);
	}
	
	@Test
	public void TestRemoveMulitplex() {
		dao.removeMultiplex(30);
	}
}
