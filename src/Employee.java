public class Employee {

    private String firstName;
    private String lastName;
    private String login;
    private int password;

    public Employee(String firstName, String lastName, String login, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }
}
