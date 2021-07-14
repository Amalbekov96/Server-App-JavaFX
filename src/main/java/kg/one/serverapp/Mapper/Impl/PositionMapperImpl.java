package kg.one.serverapp.Mapper.Impl;

import kg.one.serverapp.Dto.PositionDto;
import kg.one.serverapp.Mapper.PositionMapper;
import kg.one.serverapp.Model.Position;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionMapperImpl implements PositionMapper {
    @Override
    public PositionDto toDto(Position entity) {
        return PositionMapper.INSTANCE.toDto(entity);
    }

    @Override
    public Position toEntity(PositionDto dto) {
        return PositionMapper.INSTANCE.toEntity(dto);
    }

    @Override
    public List<PositionDto> toDtoList(List<Position> entityList) {
        return PositionMapper.INSTANCE.toDtoList(entityList);
    }

    @Override
    public List<Position> toEntityList(List<PositionDto> dtoList) {
        return PositionMapper.INSTANCE.toEntityList(dtoList);
    }
}
