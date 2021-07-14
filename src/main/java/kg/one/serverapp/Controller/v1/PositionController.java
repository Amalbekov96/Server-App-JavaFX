package kg.one.serverapp.Controller.v1;

import kg.one.serverapp.Controller.BaseCrudController;
import kg.one.serverapp.Dto.PositionDto;
import kg.one.serverapp.Model.Position;
import kg.one.serverapp.Service.Impl.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/positions")
public class PositionController implements BaseCrudController<PositionDto, Long> {

    @Autowired
    private PositionService positionService;

    @Override
    public PositionDto save(PositionDto positionDto) {

        System.out.println(positionDto.getName());
        return positionService.save(positionDto);
    }

    @Override
    public PositionDto update(PositionDto positionDto) {
        return positionService.update(positionDto);
    }

    @Override
    public List<PositionDto> findAll() {
        return positionService.findAll();
    }

    @Override
    public PositionDto findById(Long id) {
        return positionService.findById(id);
    }

    @Override
    public void deleteById(Long id) { positionService.deleteById(id);
    }
}
