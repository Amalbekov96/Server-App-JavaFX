package kg.one.serverapp.Mapper.Impl;

import kg.one.serverapp.Dto.DepartmentDto;
import kg.one.serverapp.Mapper.DepartmentMapper;
import kg.one.serverapp.Model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentDto toDto(Department entity) {
        return DepartmentMapper.INSTANCE.toDto(entity);
    }

    @Override
    public Department toEntity(DepartmentDto dto) {
        return DepartmentMapper.INSTANCE.toEntity(dto);
    }

    @Override
    public List<DepartmentDto> toDtoList(List<Department> entityList) {
        return DepartmentMapper.INSTANCE.toDtoList(entityList);
    }

    @Override
    public List<Department> toEntityList(List<DepartmentDto> dtoList) {
        return DepartmentMapper.INSTANCE.toEntityList(dtoList);
    }
}
