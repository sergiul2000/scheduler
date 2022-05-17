package Services;

import model.Rezervare;

import java.util.List;

public interface RezervareService {
    Rezervare findById(Long id);
    Rezervare add(Rezervare rezervare);
    List<Rezervare> listAll();
    void remove(Long id);
    Rezervare update(Rezervare rezervare);
}
