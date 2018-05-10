package com.example.zf.designpatterns.iterator;

import java.util.Iterator;

public class BookShelf {
    private Book[] books;
    private int last;

    /**
     *
     * @param maxSize 书架所能容纳的最大量
     */
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }

}
