package kg.one.serverapp.Repository;

import kg.one.serverapp.Model.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepo extends CrudRepository<Position, Long> {
}
