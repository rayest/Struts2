package cn.rayest.book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayest on 2016/7/20 0020.
 */
public class BookAction {
    private static List<Book> bookList = new ArrayList<Book>();
    private String title;
    private Book book;

    public static void setBookList(List<Book> bookList) {
        BookAction.bookList = bookList;
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String initAdd(){
        return "initAdd";
    }

    public String add(){
        bookList.add(book);
        title = "<br/><br/>添加书籍成功！<br/><br/>";
        return "success";
    }

    public String list(){
        return "list";
    }

    public String clear(){
        bookList.clear();
        title = "<br/><br/>清空书籍列表成功！<br/><br/>";
        return "list";
    }

}
