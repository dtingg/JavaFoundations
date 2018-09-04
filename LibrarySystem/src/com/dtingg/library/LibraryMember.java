package com.dtingg.library;

/**
 * Custom LibraryMember class
 */
public class LibraryMember {
    private String firstName;
    private String lastName;
    private Book bookCheckedOut;

    /**
     * Class constructor
     * @param firstName member first name
     * @param lastName member last name
     */
    public LibraryMember(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookCheckedOut = null; //set default to null
    }

    /**
     * Method for checking out books
     * @param book Book you want to check out
     */
    public void checkOutBook(Book book){
        //book is available and user has nothing checked out
        if (!book.getCheckedOut() && bookCheckedOut == null){
            book.setCheckedOut(true);
            bookCheckedOut = book;
            System.out.println(firstName + " " + lastName + " checked out book " + book.getTitle() + ".");

            //book is not available
        } else if(book.getCheckedOut()){
            System.out.println("Sorry " + firstName + " " + lastName + ". " + book.getTitle() + " is already checked out.");

            //user already has a book checked out
        } else if(bookCheckedOut != null){
            System.out.println("Sorry " + firstName + " " + lastName + ". You already have a book checked out.");
        }
    }

    /**
     * Method for checking in books
     */
    public void checkInBook(){
        //See if user has a book checked out
        if(bookCheckedOut == null){
            System.out.println("You don't have any books to check in.");

        } else {
            //Save book as returnedBook and set to not checked out
            Book returnedBook = bookCheckedOut;
            returnedBook.setCheckedOut(false);

            //Change member's bookCheckedOut to null
            bookCheckedOut = null;
            System.out.println(firstName + " " + lastName + " returned " + returnedBook.getTitle() + ".");
        }
    }

    //Getters and setters for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Getters and setters for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getters and setters for bookCheckedOut
    public Book getBookCheckedOut() {
        return bookCheckedOut;
    }

    public void setBookCheckedOut(Book book) {
        this.bookCheckedOut = book;
    }
}