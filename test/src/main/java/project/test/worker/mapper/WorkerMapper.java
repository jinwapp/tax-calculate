package project.test.worker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.test.worker.dto.WorkerDto;
import project.test.worker.entity.Worker;

@Mapper(componentModel = "spring")
public interface WorkerMapper {

    WorkerMapper INSTANCE = Mappers.getMapper(WorkerMapper.class);

    WorkerDto toDTO(Worker worker);

    Worker toEntity(WorkerDto workerDTO);
}
