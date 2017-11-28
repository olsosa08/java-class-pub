package exercise10;

import java.util.Comparator;
import java.util.Objects;

/**
 * Class Book
 * @author yasiro01
 */
public class Book {
    final String title;
    final String author;
    Double price;
    final int year;

    public Book(String title, String author, Double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    
    public Book(Book other){
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.year = other.year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.author);
        hash = 67 * hash + Objects.hashCode(this.price);
        hash = 67 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return String.format("%s (%d) by %s costs $%.2f", title, year, author, price);
    }
}

class ByTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2){
        return o1.title.compareTo(o2.title);
    }
}

class ByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2){
        return o1.author.compareTo(o2.author);
    }
}

class ByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2){
        return o1.price.compareTo(o2.price);
    }
}

class ByYear implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2){
        return o1.price.compareTo(o2.price);
    }
}
