package org.example.day2;

import org.example.day2.library.Book;

public class DayTwo {

    public static void main(String[] args) {
        //String variable = String object;
    //        String hello = new String("hello");
    //        System.out.println("This is the first:" +hello+ " this is the second hello with just the constructor "+new String("I am the second hello"));

        Book libraryBook = new Book();
        libraryBook.setName("Spider-Man");
        System.out.println(libraryBook.getName());

    }
}
