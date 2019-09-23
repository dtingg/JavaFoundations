# Assignment 3: Library System

For this assignment, you will create a basic library system. This system will be able manage library members and the books the library lends.

**Assumptions.**  There will be two items in the library system to begin with, books and library members. We will make two rules:

* A user can only checkout one book at a time.  
* A book cannot be checked out when it is already checked out.
 
**Packages:**  
There will be two packages in this assignment
* com.`<firstinitialastname>` ie com.cburke
  * The LibraryDriver class will exist in this package
* com.`<first_initial_lastname>`.library
  * Book and Library Member classes will exist in this package

**Classes:**

**Book:**  

**data members:** title, author, published date, publishing company, checked out    
**methods:** constructor, appropriate getters and setters, printStatus  

printStatus method will print to the console “Book is not checked out.” if the book is not checked out, otherwise the it will print “Book is checked out.”

**LibraryMember:**  

**data members:** first name, last name, Book checked out    
**methods:** constructor, appropriate getters and setters, checkOutBook  

The “checkOutBook” method has the following requirements:
* it will take a Book object as a parameter
* if the book is not checked out then the LibraryMember will get the book
* set the LibraryMember’s checkedOutBook data member to the book passed into the method
* set the book’s checked out data member to true
* this method will print statements to the console
  * print “User checked out book” if the books got checked out
  * print “User failed to check out book” if the book check out failed.
 
**LibraryDriver:**  
**Methods: main method**

Inside main method:
* create at least 4 Books
* create at least 5 Library Members
* attempt to checkout one book twice
* Have a library member checkout two or more books
 
**HINTS:** All the data members of the Book object are of type String except for published date which is java.util.Date and checked out which is a boolean.

**BONUS 1:** Add Logic to tell me why the checkout failed
