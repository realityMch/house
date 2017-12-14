package com.carlmung.rest.book;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GenericGenerator(name = "user-uuid", strategy = "uuid")
    @GeneratedValue(generator = "user-uuid")
    @Column(name = "id", nullable = false, length = 64)
    private String id;

    @Column(name = "full_name")
    private String fullName;

    private String author;

    private String publisher;

    private Double price;

    private String introduce;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Double getPrice() {
        return price;
    }

    public String getIntroduce() {
        return introduce;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
