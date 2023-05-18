public class Person {
    private String firstName;
    private String lastName;
    private int id;
    private static int personCounter = 0;

    public Person(String firstName, String lastName) {
        personCounter++;
        this.id = personCounter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{ Id=" + id +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
