package problem1;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    // --------------------------------------------------------------
    public Person(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }
    // --------------------------------------------------------------
    public String getLast() // get last name
    {
        return lastName;
    }
    @Override
    public String toString() {
        return "problem1.Person [lastName=" + lastName + "\nFirstName=" + firstName +
                "\nAge=" + age + "]";
    }
} // end class problem1.Person