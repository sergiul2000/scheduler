package Services;

import model.Sala;

import java.util.LinkedHashMap;
import java.util.List;

public interface SalaService{
    Sala findById(int id);
        Sala add(Sala sala);
        List<Sala> listAll();
        void remove(int id);
        Sala update(Sala sala);
}
