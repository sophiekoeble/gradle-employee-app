public class Employee {
    String name;
    String emailAddress;
    int yearOfBirth;
}


public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "John";
        employee.emailAddress = "john@baeldung.com";
        employee.yearOfBirth = 1978;

        System.out.println("Name: " + employee.name);
        System.out.println("Email Address: " + employee.emailAddress);
        System.out.println("Year of Birth: " + employee.yearOfBirth);
    }
}