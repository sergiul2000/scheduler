package Services;

import model.Sala;
import repos.SalaRepo;

import java.util.List;

public class SalaServiceImpl implements  SalaService{
    SalaRepo salaRepo;

    public SalaServiceImpl(SalaRepo salaRepo) {
        this.salaRepo = salaRepo;
    }

    @Override
    public Sala findById(Long id) {
        return this.salaRepo.findById(id).get();
    }

    @Override
    public Sala add(Sala sala) {
        return this.salaRepo.save(sala);
    }

    @Override
    public List<Sala> listAll() {
        return salaRepo.findAll();
    }

    @Override
    public void remove(Long id) {
        salaRepo.delete(salaRepo.findById(id).get());
    }

    @Override
    public Sala update(Sala updated) {
        Sala sala = salaRepo.findById(updated.getId()).get();
        sala.setNr(updated.getNr());
        return salaRepo.save(sala);
    }
}
