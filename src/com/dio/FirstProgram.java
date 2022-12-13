package com.dio;

import com.dio.model.Cat;

public class FirstProgram {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Book book = new Book();
		
		System.out.println(cat);
		System.out.println(book);

	}

}

class Book {
	private String name;
	private String npag;
}