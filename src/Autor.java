public class Autor {
    private String firstName; //Имя
    private String lastName; //Фамилия

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Autor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
