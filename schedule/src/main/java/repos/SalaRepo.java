package repos;

import model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepo extends JpaRepository<Sala, Integer> {
}
