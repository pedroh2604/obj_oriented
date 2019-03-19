/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg3;

/**
 *
 * @author lab801
 */
public class LibraryBook {
    private String title;
    private String author;
    private int publishYear;
    private String publisher;
    private String synopsis;
    private int edition;
    private int pages;

    public LibraryBook(String title, String author, int publishYear, String publisher, String synopsis, int edition, int pages) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.publisher = publisher;
        this.synopsis = synopsis;
        this.edition = edition;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "LibraryBook{" + "title=" + title + ", author=" + author + ", publishYear=" + publishYear + ", publisher=" + publisher + ", synopsis=" + synopsis + ", edition=" + edition + ", pages=" + pages + '}';
    }
    
    
}
