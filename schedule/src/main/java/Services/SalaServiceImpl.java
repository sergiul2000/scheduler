package Services;

import model.Sala;
import org.springframework.stereotype.Service;
import repos.SalaRepo;

import java.util.List;

@Service
public class SalaServiceImpl implements  SalaService{
    SalaRepo salaRepo;

    public SalaServiceImpl(SalaRepo salaRepo) {
        this.salaRepo = salaRepo;
    }

    @Override
    public Sala findById(int id) {
        return this.salaRepo.findById(id).get();
    }

    @Override
    public Sala addSala(Sala sala) {
        return this.salaRepo.save(sala);
    }

    @Override
    public List<Sala> getSali() {
        return salaRepo.findAll();
    }

    @Override
    public void deleteSala(int id) {
        salaRepo.delete(salaRepo.findById(id).get());
    }


}
