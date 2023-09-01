//import java.util.Scanner;
import java.util.*;
class Library{
    String []books;
    String PersonName;
    int BooksQuantity;
    public void initializeBooksArray(int size) {
        books = new String[size];
    }

    public void AddBook(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        this.PersonName = s.next();
        System.out.println("Enter how many books you want to Add :");
        int numBooks = s.nextInt();

        books = new String[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter " + (i + 1) + " book name");
            String saveBook = s.next();
            this.books[i] = saveBook;
        }
        this.BooksQuantity = numBooks;
    }


    public void IssueBook(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name ");
        PersonName=s.next();
        System.out.println("Available Books ........");
        ShowAvailableBooks();

        System.out.println("Enter the book name you want to borrow:");
        String desiredBook = s.next();

        boolean bookFound = false;
        for (String book : books) {
            if (book.equalsIgnoreCase(desiredBook)) {
                bookFound = true;
                System.out.println("Your book '" + desiredBook + "' is issued.");
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book not found in the library.");
        }
    }
    public void ShowAvailableBooks(){
        System.out.println(".........Available Books on Library .........");
        for (String book : books) {
            System.out.println("- " + book);
        }

    }
    public void ReturnBook(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        PersonName = s.next();

        System.out.println("Enter the book name you want to return:");
        String returnedBook = s.next();

        boolean bookFound = false;
        for (String book : books) {
            if (book.equalsIgnoreCase(returnedBook)) {
                bookFound = true;
                System.out.println("Thank you for returning the book '" + returnedBook + "'.");
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book not found in your issued books.");
        }
    }

    }
public class OnlineLibrary {
    public static void main(String[] args) {
        System.out.println("............Welcome to the Online Library .........");
        System.out.println(".......Select 1 for Adding book in Library.......");
        System.out.println(".......Select 2 for Issue book of Library.......");
        System.out.println(".......Select 3 to Show Available books in Library.......");
        System.out.println(".......Select 4 for Return book of Library.......");
        Scanner sc = new Scanner(System.in);
        Library library1 = new Library();
        library1.initializeBooksArray(10); // Initialize the books array with a certain size
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    library1.AddBook();
                    break;
                case 2:
                    library1.IssueBook();
                    break;
                case 3:
                    library1.ShowAvailableBooks();
                    break;
                case 4:
                    library1.ReturnBook();
                    break;
                default:
                    System.out.println("Incorrect Choice");


            }

        }
    }
}
