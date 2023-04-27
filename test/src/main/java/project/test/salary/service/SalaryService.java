package project.test.salary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.test.salary.dto.SalaryDto;
import project.test.salary.entity.Salary;

@Service
public class SalaryService {

    @Override
    public SalaryDto addSalary(SalaryDto salaryDTO) throws InvalidInputException {
        validateInput(salaryDTO);
        Salary savedSalary = salaryRepository.save(SalaryMapper.INSTANCE.toEntity(salaryDTO));
        return SalaryMapper.INSTANCE.toDTO(savedSalary);
    }

    private void validateInput(SalaryDTO salaryDTO) throws InvalidInputException {
        // Validate employee information
        if (StringUtils.isBlank(salaryDTO.getEmployeeNumber())
                || StringUtils.isBlank(salaryDTO.getEmployeeName())
                || StringUtils.isBlank(salaryDTO.getResidentRegistrationNumber())) {
            throw new InvalidInputException("Invalid employee information");
        }
        // Validate salary information
        if (salaryDTO.getYearOfAttribution() == null
                || StringUtils.isBlank(salaryDTO.getSalaryItem())
                || salaryDTO.getSalaryAmount() == null
                || StringUtils.isBlank(salaryDTO.getSalaryType())
                || salaryDTO.getStartDate() == null
                || salaryDTO.getEndDate() == null) {
            throw new InvalidInputException("Invalid salary information");
        }
    }
}

