public class Employee extends Person{

    private String document;

    public Employee(String name, String document) {
        super(name);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
