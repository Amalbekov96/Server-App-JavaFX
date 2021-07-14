package kg.one.serverapp.Mapper;

import java.util.List;


public interface BaseMapper <S, T>{
    S toDto(T entity);
    T toEntity( S dto);
    List<S> toDtoList(List<T> dtoList);
    List<T> toEntityList(List<S> entityList);
}
