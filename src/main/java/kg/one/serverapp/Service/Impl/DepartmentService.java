package kg.one.serverapp.Service.Impl;

import kg.one.serverapp.Dto.DepartmentDto;
import kg.one.serverapp.Exception.DepartmentNotFound;
import kg.one.serverapp.Mapper.DepartmentMapper;
import kg.one.serverapp.Model.Department;
import kg.one.serverapp.Repository.DepartmentRepo;
import kg.one.serverapp.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements BaseService<DepartmentDto, Long> {

    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        Department departament = departmentMapper.toEntity(departmentDto);
        departmentRepo.save(departament);
        return DepartmentMapper.INSTANCE.toDto(departament);
    }

    @Override
    public DepartmentDto update(DepartmentDto departmentDto) {
        Department department = departmentMapper.toEntity(departmentDto);
        departmentRepo.save(department);
        return departmentMapper.toDto(department);
    }

    @Override
    public void deleteById(Long id) {
        departmentRepo.deleteById(id);
    }

    @Override
    public DepartmentDto findById(Long id) {
        return departmentMapper.toDto(departmentRepo.findById(id).orElseThrow(()-> new DepartmentNotFound("Current department is not found")));
    }

    @Override
    public List<DepartmentDto> findAll() {
        return departmentMapper.toDtoList( (List<Department>) departmentRepo.findAll());
    }
}
