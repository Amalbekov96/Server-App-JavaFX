package kg.one.serverapp.Mapper;

import kg.one.serverapp.Dto.PositionDto;
import kg.one.serverapp.Model.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PositionMapper extends BaseMapper<PositionDto, Position>{
    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);
}
