package weekend02;
public class Person {
    private String  firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        String s= new StringBuilder(firstName).append(" ").append(lastName).append(", ").append(age).toString();
        return s;
                /*firstName + " " +
                        lastName + ", " +
                        age ;*/
    }
}
