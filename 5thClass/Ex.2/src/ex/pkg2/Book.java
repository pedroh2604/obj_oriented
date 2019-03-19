/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg2;

/**
 *
 * @author lab801
 */
public class Book {
    private String title;
    private String author;
    private int publishYear;
    private String publisher;
    private String synopsis;
    private int edition;
    private float height;
    private float width;
    private float length;
    private float weigth;
    private int pages;

    public Book(String title, String author, int publishYear, String publisher, String synopsis, int edition, float height, float width, float length, float weigth, int pages) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.publisher = publisher;
        this.synopsis = synopsis;
        this.edition = edition;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weigth = weigth;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publishYear=" + publishYear + ", publisher=" + publisher + ", synopsis=" + synopsis + ", edition=" + edition + ", height=" + height + ", width=" + width + ", length=" + length + ", weigth=" + weigth + ", pages=" + pages + '}';
    }
    
    
}
