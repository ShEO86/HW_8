public class Book {
    private String autorFirstName; //Имя
    private String futorLastName; //Фамилия
    private int publicationYear;
    private String bookTitle;

    public String getAutorFirstName() {
        return autorFirstName;
    }

    public void setAutorFirstName(String autorFirstName) {
        this.autorFirstName = autorFirstName;
    }

    public String getFutorLastName() {
        return futorLastName;
    }

    public void setFutorLastName(String futorLastName) {
        this.futorLastName = futorLastName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book(String bookTitle, String autorFirstName, String futorLastName, int publicationYear) {
        this.autorFirstName = autorFirstName;
        this.futorLastName = futorLastName;
        this.publicationYear = publicationYear;
        this.bookTitle = bookTitle;
    }
}
