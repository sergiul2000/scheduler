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
    public Rezervare addRezervare(Rezervare rezervare) {
        return rezervareRepo.save(rezervare);
    }

    @Override
    public List<Rezervare> getRezervari() {
        return rezervareRepo.findAll();
    }

    @Override
    public void deleteRezervare(int id) {
        rezervareRepo.delete(rezervareRepo.findById(id).get());
    }


}
