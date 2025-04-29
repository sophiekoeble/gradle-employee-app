package employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeApp {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeApp.class);


    public static void main(String[] args) {

        PersonalData personalData = new PersonalData();
        personalData.main();


        // Employee john = new Employee();
        // Employee jack = new Employee();
        // Employee hans = new Employee();
        

        // john.setName("John");
        // john.setEmailAddress("john@baeldung.com");
        // john.setYearOfBirth(1978);

        // john.log();
        // jack.log();
        // hans.log();

        // logger.info("Name: " + john.getName());
        // logger.info("Email Address: " + john.getEmailAddress());
        // logger.info("Year of Birth: " + john.getYearOfBirth());

        System.exit(0);
    }
}
