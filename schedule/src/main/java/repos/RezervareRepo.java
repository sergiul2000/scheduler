package repos;

import model.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepo extends JpaRepository<Rezervare, Long> {
}
