package lesson5;

public class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    private String surname;
    private int indexNumber;

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    private static int numberOfStudents = 0;

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        numberOfStudents++;
    }

    public Student() {
        this.numberOfStudents++;
    }
}
