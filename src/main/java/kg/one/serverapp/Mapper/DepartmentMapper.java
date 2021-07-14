package kg.one.serverapp.Mapper;

import kg.one.serverapp.Dto.DepartmentDto;
import kg.one.serverapp.Model.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper extends BaseMapper<DepartmentDto, Department>{
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
}
