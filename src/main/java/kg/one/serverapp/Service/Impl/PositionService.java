package kg.one.serverapp.Service.Impl;

import kg.one.serverapp.Dto.PositionDto;
import kg.one.serverapp.Exception.PositionNotFoundException;
import kg.one.serverapp.Mapper.PositionMapper;
import kg.one.serverapp.Model.Position;
import kg.one.serverapp.Repository.PositionRepo;
import kg.one.serverapp.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements BaseService<PositionDto, Long> {

    @Autowired
    private PositionRepo positionRepo;
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public PositionDto save(PositionDto positionDto) {
        Position position = positionMapper.toEntity(positionDto);
        positionRepo.save(position);
        return positionMapper.toDto(position);
    }

    @Override
    public PositionDto update(PositionDto positionDto) {
        Position position = positionMapper.toEntity(positionDto);
        positionRepo.save(position);
        return positionMapper.toDto(position);
    }

    @Override
    public void deleteById(Long id) {
       positionRepo.deleteById(id);
    }

    @Override
    public PositionDto findById(Long id) {
        return positionMapper.toDto(positionRepo.findById(id).orElseThrow(()->new PositionNotFoundException("Current position is not found")));
    }

    @Override
    public List<PositionDto> findAll() {
        return positionMapper.toDtoList((List<Position>) positionRepo.findAll());
    }
}
