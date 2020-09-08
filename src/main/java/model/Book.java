package model;

import java.util.List;
import java.util.Objects;

public class Book {

    private String title;
    private String isbn;
    private String publisher;
    private int year;
    private List<Author> author;

    public Book(String title, String isbn, String publisher, int year, List<Author> author) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  year == book.year &&
                title.equals(book.title) &&
                isbn.equals(book.isbn) &&
                publisher.equals(book.publisher) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, isbn, publisher, year, author);
    }
}