package Services;

import model.Rezervare;

import java.util.List;

public interface RezervareService {
    Rezervare findById(int id);
    Rezervare addRezervare(Rezervare rezervare);
    List<Rezervare> getRezervari();
    void deleteRezervare(int id);
}
