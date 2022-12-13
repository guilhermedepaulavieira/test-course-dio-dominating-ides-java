package com.dio;

import com.dio.model.Cat;

public class FirstProgram {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Book book = new Book();
		
		System.out.println(cat);
		System.out.println(book);
		
		System.out.println(cat);
		System.out.println(book);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/

	}

}

class Book {
	private String name;
	private String npag;
}