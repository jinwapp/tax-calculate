package project.test.salary.entity;

import javax.persistence.*;
import java.time.LocalDate;

public class Salary {

    @Entity
    @Table(name = "salary")
    public class Salary {


        @Column(name = "resident_registration_number")
        private String residentRegistrationNumber;

        @Column(name = "year_of_attribution")
        private Integer yearOfAttribution;

        @Column(name = "salary_item")
        private String salaryItem;

        @Column(name = "salary_amount")
        private Double salaryAmount;

        @Column(name = "salary_type")
        private String salaryType;

        @Column(name = "start_date")
        private LocalDate startDate;

        @Column(name = "end_date")
        private LocalDate endDate;

        // Constructor, getters and setters
    }

}
