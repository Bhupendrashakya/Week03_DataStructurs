package com.tit.day1linkedlist.doublylinkedlist.librarymanagment;

public class LibraryManagmentSystem {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Adding some books using different methods
        list.addBookAtEnd("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        list.addBookAtBeginning("1984", "George Orwell", "Dystopian", 102, true);
        list.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 103, true);
        list.addBookAtPosition(2, "Moby Dick", "Herman Melville", "Adventure", 104, false);
        list.addBookAtEnd("Pride and Prejudice", "Jane Austen", "Romance", 105, true);
        list.addBookAtBeginning("The Catcher in the Rye", "J.D. Salinger", "Fiction", 106, true);
        list.addBookAtPosition(3, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 107, false);

        // Displaying all books in forward order
        System.out.println("All books (forward):");
        list.displayAllBooksForward();

        // Displaying all books in reverse order
        System.out.println("\nAll books (reverse):");
        list.displayAllBooksReverse();

        // Updating a book's availability status
        System.out.println("\nUpdating availability for 'The Great Gatsby':");
        list.updateAvailabilityById(101, false);
        list.displayAllBooksForward();

        // Searching for a book by title
        System.out.println("\nSearching for book with title '1984':");
        list.searchBookByTitle("1984");

        // Searching for a book by author
        System.out.println("\nSearching for books by 'George Orwell':");
        list.searchBookByAuthor("George Orwell");

        // Counting total number of books
        System.out.println("\nTotal number of books in the library:");
        System.out.println(list.countTotalBooks());

        // Removing a book by Book ID
        System.out.println("\nRemoving 'Moby Dick':");
        list.removeBookById(104);
        list.displayAllBooksForward();
    }
}
