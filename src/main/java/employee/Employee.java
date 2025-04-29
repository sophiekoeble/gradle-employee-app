package employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {
    private String name;
    private String emailAddress;
    private int yearOfBirth;

    public static final Logger logger = LoggerFactory.getLogger(Employee.class);

    public Employee(String name, String email, int birth) {
        this.name = name;
        this.emailAddress = email;
        this.yearOfBirth = birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void log() {
        logger.info("Name: " + getName());
        logger.info("Email Address: " + getEmailAddress());
        logger.info("Year of Birth: " + getYearOfBirth());
    }

}

