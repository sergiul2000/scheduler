package Services;

import model.Rezervare;
import org.springframework.stereotype.Service;
import repos.ClientRepo;
import repos.RezervareRepo;

import java.util.List;

@Service
public class RezervareServiceImpl implements RezervareService{

    private RezervareRepo rezervareRepo;

    public RezervareServiceImpl(RezervareRepo rezervareRepo) {
        this.rezervareRepo = rezervareRepo;
    }

    @Override
    public Rezervare findById(int id) {
        return rezervareRepo.findById(id).get();
    }

    @Override
    public Rezervare add(Rezervare rezervare) {
        return rezervareRepo.save(rezervare);
    }

    @Override
    public List<Rezervare> listAll() {
        return rezervareRepo.findAll();
    }

    @Override
    public void remove(int id) {
        rezervareRepo.delete(rezervareRepo.findById(id).get());
    }

    @Override
    public Rezervare update(Rezervare updated) {
        Rezervare rezervare = rezervareRepo.findById(updated.getId()).get();
        rezervare.setOra(updated.getOra());
        return rezervareRepo.save(rezervare);
    }
}
