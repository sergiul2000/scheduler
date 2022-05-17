package repos;

import model.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RezervareRepo extends JpaRepository<Rezervare, Integer> {
}
