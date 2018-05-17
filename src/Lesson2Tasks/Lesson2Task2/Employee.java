package lesson2Tasks.lesson2Task2;

public class Employee {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int numberOfWorkinYears;

    public Employee(String firstName, String lastName, int yearOfBirth, int numberOfWorkingYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.numberOfWorkinYears = numberOfWorkingYears;
    }

    public void pretendToWork() {
        System.out.println("Udaje, ze pracuje!");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getNumberOfWorkinYears() {
        return numberOfWorkinYears;
    }
}
