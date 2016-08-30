package cn.rayest.book;

import java.sql.Date;

/**
 * Created by Rayest on 2016/7/20 0020.
 */
public class Book {
    private String name;
    private String author;
    private Date publishedDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
