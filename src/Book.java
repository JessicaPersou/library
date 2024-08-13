public class Book {

    private String title;
    private Author author;
    private Long isbn;
    private boolean avaliable;

    public Book(String title, Author author, Long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

        public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }
}
