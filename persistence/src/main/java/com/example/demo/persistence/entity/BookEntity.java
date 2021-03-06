package com.example.demo.persistence.entity;

import com.google.common.base.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    public BookEntity() {
    }

    public BookEntity(Long id,
                      String title,
                      String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public BookEntity(String title,
                      String author) {
        this(null, title, author);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof BookEntity that)) {
            return false;
        }

        return Objects.equal(id, that.id) &&
                Objects.equal(title, that.title) &&
                Objects.equal(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title, author);
    }
}
