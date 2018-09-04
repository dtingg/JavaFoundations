package com.dtingg;

//Import Book and LibraryMember classes
import com.dtingg.library.*;

//Import Date
import java.util.Date;

/**
 * Create a basic library system.  Manage library members and the books the library lends
 * @author dtingg written by Dianna Tingg
 */
public class LibraryDriver {

    /**
     * Main method
     * @param args command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        //Print a greeting
        System.out.println("Welcome to the West Seattle Public Library!\n");

        //Create at least 4 books
        Book bookHarryPotter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", new Date (1999-1900, 11-1, 12), "Thorndike Press");
        Book bookTwilight = new Book("Twilight", "Stephenie Meyer", new Date (2005-1900, 10-1, 5), "Little Brown");
        Book bookHungerGames = new Book("The Hunger Games", "Suzanne Collins", new Date (2008-1900, 9-1, 14), "Scholastic Press");
        Book bookCrazyRichAsians = new Book("Crazy Rich Asians", "Kevin Kwan", new Date (2013-1900, 6-1, 11), "Doubleday");

        //Create at least 5 library members
        LibraryMember memberDianna = new LibraryMember("Dianna", "Tingg");
        LibraryMember memberGreg = new LibraryMember("Greg", "Wright");
        LibraryMember memberHeidi = new LibraryMember("Heidi", "Blair");
        LibraryMember memberQuyen = new LibraryMember("Quyen", "Leavitt");
        LibraryMember memberBrian = new LibraryMember("Brian", "Leavitt");

        //Have a library member check out a book
        System.out.println("Have a library member check out a book.");
        memberDianna.checkOutBook(bookCrazyRichAsians);
        memberQuyen.checkOutBook(bookHarryPotter);
        memberBrian.checkOutBook(bookHungerGames);

        //Attempt to checkout the same book twice.
        System.out.println("\nAttempt to check out the same book twice.");
        memberGreg.checkOutBook(bookCrazyRichAsians);

        //Have a library member check out two or more books
        System.out.println("\nHave a library member check out two or more books.");
        memberDianna.checkOutBook(bookTwilight);

        //Have a library member check in a book
        System.out.println("\nHave a library member return a book.");
        memberDianna.checkInBook();

        //Have a library member check out the recently returned book.
        System.out.println("\nHave a library member check out the recently returned book.");
        memberHeidi.checkOutBook(bookCrazyRichAsians);

        //Print status of a book
        System.out.println("\nPrint the status of a book.");
        bookHarryPotter.printStatus();

        //Print details of a book
        System.out.println("\nPrint the details of a book.");
        bookHungerGames.printDetails();
    }
}