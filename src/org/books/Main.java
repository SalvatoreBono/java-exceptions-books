package org.books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many books do you want to include?");
        int numBooks = Integer.parseInt(keyboard.nextLine());
        Book[] books = new Book[numBooks];

        for (int i = 0; i <books.length ; i++) {
            boolean success = false;
            do {
                try {
                    System.out.print("Book title:");
                    //trim rimuove gli spazi
                    String bookTitle = keyboard.nextLine().trim();
                    System.out.print("Number of pages:");
                    int numPages = Integer.parseInt(keyboard.nextLine());
                    System.out.print("Author:");
                    String author = keyboard.nextLine().trim();
                    System.out.print("Publisher:");
                    String publisher = keyboard.nextLine().trim();
                    books[i] = new Book(bookTitle,numPages,author,publisher);
                    success=true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }while (!success);

        }

        for (Book book : books) {
            System.out.println(book.getFullInfoBook());
        }
        //percorso file
        File root = new File("./resources/books.txt");


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(root);
            for (Book book : books) {
                //Scrivere il contenuto nel root
                fileWriter.write(book.getFullInfoBook());;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        keyboard.close();
    }
}
