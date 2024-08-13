public class Author extends Person {

    private Book[] books = new Book[10];

    public Author(String name, Book[] books) {
        super(name);
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
