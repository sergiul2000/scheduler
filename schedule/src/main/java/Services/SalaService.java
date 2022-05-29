package Services;

import model.Sala;

import java.util.LinkedHashMap;
import java.util.List;

public interface SalaService{
    Sala findById(int id);
        Sala addSala(Sala sala);
        List<Sala> getSali();
        void deleteSala(int id);
}
