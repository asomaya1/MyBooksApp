package model;

import java.util.Objects;

public class Author {

    private String name;
    private int numOfBooks;
    private String nationality;

    public Author(String name, int numOfBooks, String nationality) {
        this.name = name;
        this.numOfBooks = numOfBooks;
        this.nationality = nationality;
    }
    //This will appear on BranchB
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", numOfBooks=" + numOfBooks +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return  numOfBooks == author.numOfBooks &&
                name.equals(author.name) &&
                nationality.equals(author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfBooks, nationality);
    }
}

