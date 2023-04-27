package project.test.salary.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.test.salary.dto.SalaryDto;
import project.test.salary.entity.Salary;

@Mapper(componentModel = "spring")
public interface SalaryMapper {

    SalaryMapper INSTANCE = Mappers.getMapper(SalaryMapper.class);

    SalaryDto toDTO(Salary salary);

    Salary toEntity(SalaryDto salaryDTO);
}
