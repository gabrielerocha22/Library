package br.com.gabriele.user;

import java.util.HashMap;
import java.util.Map;

import br.com.gabriele.books.Book;

public class User {

	private Integer id;              
	private String name;
	private String dateBirth;
	
	Map<Book, Integer> lending = new HashMap<>();
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getDateBirth() {
		return dateBirth;
	}

}
