public class Ebook extends Book{
    private String format;

    public Ebook(String title, Author author, Long isbn, String format) {
        super(title, author, isbn);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
