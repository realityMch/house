package com.carlmung.rest.book;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;
    @Column(name = "full_name")
    private String fullName;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {

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
