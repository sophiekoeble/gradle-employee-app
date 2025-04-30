package employee;

public class EmployeeApp {

    public static void main(String[] args) {

        PersonalData personalData = new PersonalData();
        personalData.loadEmployeesFromCSV();

        System.exit(0);
    }
}
