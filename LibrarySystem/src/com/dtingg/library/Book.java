package com.dtingg.library;

//Import date
import java.util.Date;

/**
 * Custom book class
 */
public class Book {
    private boolean checkedOut;
    private String title;
    private String author;
    private Date publishedDate;
    private String publishingCompany;

    /**
     * Class constructor
     * @param title Book title
     * @param author Book author
     * @param publishedDate Book published date
     * @param publishingCompany Book publishing company
     */
    public Book(String title, String author, Date publishedDate, String publishingCompany) {
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.publishingCompany = publishingCompany;
        this.checkedOut = false; //set default to false
    }

    //Prints either "Book is checked out" or "Book is not checked out"
    public void printStatus() {
        if (checkedOut) {
            System.out.println("Book " + title + " is checked out.");
        } else {
            System.out.println("Book " + title + " is not checked out.");
        }
    }

    //Print book details
    public void printDetails(){
        System.out.println("Title: " + title + ", Author: " + author + ", Published date: " + String.format("%tb %te, %tY", publishedDate, publishedDate, publishedDate) + ", Publishing company: " + publishingCompany);
    }

    //Getters and setters for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Getters and setters for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Getters and setters for published date
    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    //Getters and setters for publishing company
    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    //Getters and setters for checked out
    public boolean getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}