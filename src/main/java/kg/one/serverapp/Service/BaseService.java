package kg.one.serverapp.Service;

import java.util.List;

public interface BaseService <S, T>{

    S save(S s);
    S update(S s);
    void deleteById(T id);
    S findById(T id);
    List<S> findAll();
}
