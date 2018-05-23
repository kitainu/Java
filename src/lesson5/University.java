package lesson5;

public class University {


    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Malinowski" ,828195);
        Student student2 = new Student("Andrzej", "Misztal", 828385);
        Student student3 = new Student("Michał", "Pietrowicz", 745625);
        Student student4 = new Student();
        student4.setName("Damian");
        student4.setSurname("Damianski");
        student4.setIndexNumber(44444);
            System.out.println("Liczba studentow: "+Student.getNumberOfStudents());
    }
}
