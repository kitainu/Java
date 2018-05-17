package lesson2Tasks.lesson2Task2;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Stas", "Nowak", 4, 7);

        employee.pretendToWork();
        System.out.println("Imie: " + employee.getFirstName());
        System.out.println("Nazwisko: " + employee.getLastName());
        System.out.println("wiek " + employee.getNumberOfWorkinYears());
        System.out.println("Lata pracy " + employee.getYearOfBirth());
        
        Employee employee1 = new Employee("Jan", "Nowak", 2,15);

        employee1.pretendToWork();
        System.out.println("Imie: " + employee1.getFirstName());
        System.out.println("Nazwisko: "  + employee1.getLastName());
        System.out.println("wiek " + employee1.getNumberOfWorkinYears());
        System.out.println("Lata pracy " + employee1.getYearOfBirth());

        Employee employee2 = new Employee("Marta", "Klepacka",8,6);

        System.out.println("Imie: " + employee2.getFirstName());
        System.out.println("Nazwisko: " + employee2.getLastName());
        System.out.println("wiek " + employee2.getNumberOfWorkinYears());
        System.out.println("Lata pracy " + employee2.getYearOfBirth());
    }
}
