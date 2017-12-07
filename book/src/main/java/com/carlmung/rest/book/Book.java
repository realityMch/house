package com.carlmung.rest.book;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name")
    private String fullName;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {

        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
