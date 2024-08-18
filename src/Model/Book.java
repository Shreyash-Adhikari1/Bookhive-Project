package Model;
public class Book {

    private int id;
    private String name;
    private String Cname;
    private String contact;
    private String issueDate;
    private String returnDate;

    // Constructor
    public Book() {
    }

    public Book(int id, String name, String Cname, String contact, String issueDate, String returnDate) {
        this.id = id;
        this.name = name;
        this.Cname = Cname;
        this.contact = contact;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}