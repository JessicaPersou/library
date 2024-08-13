import java.util.ArrayList;
import java.util.List;

public class Library {
    private Client client;
    private List<Book> booksList = new ArrayList<>();
    private Employee employee;

    //cadastrar novo livro
    public void addNewBook(Book book){
        boolean newBook = booksList.add(book);
        if(newBook){
            book.setAvaliable(true);
            System.out.println("Book added to the list: " + book.getTitle());
        }
    }

    //devolver novo livro
    public void giveBackBookToLibrary(Book book, Client client){
        if(client.isActiveProfile() && client.getBorrowedBooks().size() >= 1){
            client.getBorrowedBooks().remove(book);
        }
        book.setAvaliable(true);
        System.out.println("Giving back: " + book.getTitle());
    }

    //retirar um novo livro
    public void borrowedBookInLibrary(Book book){
        if(book.isAvaliable()){
            book.setAvaliable(false);
            System.out.printf("Book: %s - (Borrowed)\n", book.getTitle());
        }else{
            System.out.println("Book: Not available");
        }

    }

    //ver lista de livros
    public List<Book> getAllBooksList(){
        for(Book book: booksList){
            if(book.isAvaliable()){
                System.out.printf("Book: %s - (ISBN: %s) - Available: %b", book.getTitle(), book.getIsbn(), book.isAvaliable());
            }else{
                System.out.printf("Book: %s - Not available: %b", book.getTitle(), book.isAvaliable());
            }
        }
        return booksList;
    }
}
