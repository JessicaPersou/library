import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Criando autores
        Author author1 = new Author("J.K. Rowling", new Book[10]);
        Author author2 = new Author("George R.R. Martin", new Book[10]);

        // Criando livros
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, 9780747532699L);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", author1, 9780747538493L);
        Book book3 = new Book("A Game of Thrones", author2, 9780553573404L);
        Book book4 = new Book("A Clash of Kings", author2, 9780553579901L);

        // Criando clientes
        Client client1 = new Client("Alice", new Date(), "123456789");
        Client client2 = new Client("Bob", new Date(), "987654321");

        // Inicializando listas de livros emprestados para os clientes
        client1.setBorrowedBooks(new ArrayList<>());
        client2.setBorrowedBooks(new ArrayList<>());

        // Criando a biblioteca
        Library library = new Library();

        // Adicionando livros à biblioteca
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);
        library.addNewBook(book4);

        // Mostrando lista de livros disponíveis na biblioteca
        System.out.println("\nLista de livros na biblioteca:");
        library.getAllBooksList();

        // Cliente 1 pegando um livro emprestado
        System.out.println("\n" + client1.getName() + " está pegando um livro emprestado:");
        client1.getBorrowedBooks().add(book1);
        library.borrowedBookInLibrary(book1);

        // Mostrando lista de livros após a retirada
        System.out.println("\nLista de livros na biblioteca após retirada:");
        library.getAllBooksList();

        // Cliente 1 devolvendo o livro
        System.out.println("\n" + client1.getName() + " está devolvendo o livro:");
        library.giveBackBookToLibrary(book1, client1);

        // Mostrando lista de livros após a devolução
        System.out.println("\nLista de livros na biblioteca após devolução:");
        library.getAllBooksList();
    }
}
