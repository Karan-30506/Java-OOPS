class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String displayInfo() {
        return "Title: " + this.title + ", Author: " + this.author;
    }
}

class Library {
    String name;
    Book[] books;

    Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        for(Book book : this.books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author);
        }
    }
}

public class aggregation {
    public static void main(String[] args) {
        // aggregation ==> represents a has-a relationship between objects
        //                 One object contains another object inside it.
        //                 But the objects can exist independently as well

        // Book and Library Both can exist independently as well
        Book book1 = new Book("Harry Potter", "J K Rowling");
        Book book2 = new Book("Avengers Doomsday", "Stan Lee");
        Book book3 = new Book("Batman v/s Superman", "DC Studios");

        Book[] books = {book1, book2, book3};

        // System.out.println(book1.displayInfo());
        // System.out.println(book2.displayInfo());
        // System.out.println(book3.displayInfo());

        Library lib = new Library("Comic Library", books);
        lib.displayInfo();
    }
}
