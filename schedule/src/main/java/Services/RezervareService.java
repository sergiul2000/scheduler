package Services;

import model.Rezervare;

import java.util.List;

public interface RezervareService {
    Rezervare findById(int id);
    Rezervare add(Rezervare rezervare);
    List<Rezervare> listAll();
    void remove(int id);
    Rezervare update(Rezervare rezervare);
}
