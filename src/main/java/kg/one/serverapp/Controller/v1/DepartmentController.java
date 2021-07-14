package kg.one.serverapp.Controller.v1;

import kg.one.serverapp.Controller.BaseCrudController;
import kg.one.serverapp.Dto.DepartmentDto;
import kg.one.serverapp.Dto.PositionDto;
import kg.one.serverapp.Model.Department;
import kg.one.serverapp.Service.Impl.DepartmentService;
import kg.one.serverapp.Service.Impl.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController implements BaseCrudController<DepartmentDto, Long> {

    @Autowired
    private DepartmentService departmentService;

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        return departmentService.save(departmentDto);
    }

    @Override
    public DepartmentDto update(DepartmentDto departmentDto) {
        return departmentService.update(departmentDto);
    }

    @Override
    public List<DepartmentDto> findAll() {
        return departmentService.findAll();
    }

    @Override
    public DepartmentDto findById(Long id) {
        return departmentService.findById(id);
    }

    @Override
    public void deleteById(Long id){ departmentService.deleteById(id); }
}
