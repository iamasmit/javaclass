package Inheritance;

public class Library {
    String address;
    Book[] books; //this associates library objects and book object

    public void showBooks() {
        System.out.println("Books");
        for (Book b : books) {
            if (b != null) {
                System.out.println(b.getTitle());
            }

        }
    }
        public static void main (String[]args){
            Library library = new Library();
            library.address = "Lazimpat";
            library.books = new Book[5];
            library.books[0] = new Book();
            library.books[1] = new Book(121, "Muna Madan", "Laxmi Prasad", "SAJHA", 1200);
            library.books[2] = new Book(221, "Shirish Ko Phool", "Parijat", "Ekta", 100);
            library.books[3] = new Book(151, "OOP in Java", "JOHN", "McGrahHill", 1500);

            library.showBooks();

            Library openLibrary = new Library();
            openLibrary.address = "Baneshor";
            openLibrary.books = new Book[3];
            openLibrary.showBooks();

        }
    }


