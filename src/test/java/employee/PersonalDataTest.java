package employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
 
/**
 *
 * @author skoble
 */
public class PersonalDataTest {

    @Test
    public void testLoadEmployeesFromCSV() {
        PersonalData personalData = new PersonalData();
        personalData.loadEmployeesFromCSV();

        assertEquals(5, personalData.getEmployees().size());
        for (Employee testEmployee : personalData.getEmployees()) {
            assertNotNull(testEmployee);
            assertNotNull(testEmployee.getName());
            assertNotNull(testEmployee.getEmailAddress());
            assertTrue(testEmployee.getYearOfBirth() > 1900);
        }
    }

}