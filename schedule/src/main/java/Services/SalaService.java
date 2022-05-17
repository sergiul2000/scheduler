package Services;

import model.Sala;

import java.util.LinkedHashMap;
import java.util.List;

public interface SalaService{
    Sala findById(Long id);
        Sala add(Sala sala);
        List<Sala> listAll();
        void remove(Long id);
        Sala update(Sala sala);
}
