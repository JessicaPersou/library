import java.util.Date;
import java.util.List;

public class Client extends Person{

    private Date birthdate;
    private String document;
    private List<Book> borrowedBooks;
    private boolean activeProfile;

    public Client(String name, Date birthdate, String document) {
        super(name);
        this.birthdate = birthdate;
        this.document = document;
        this.activeProfile = true;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public boolean isActiveProfile() {
        return activeProfile;
    }

    public void setActiveProfile(boolean activeProfile) {
        this.activeProfile = activeProfile;
    }
}
