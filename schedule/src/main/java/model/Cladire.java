package model;

import java.util.ArrayList;
import java.util.List;

public class Cladire {
    private List<Sala> listaSali;

    public Cladire() {
        this.listaSali = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cladire{" +
                "listaSali=" + listaSali +
                '}';
    }

    public List<Sala> getListaSali() {
        return listaSali;
    }

    public void setListaSali(List<Sala> listaSali) {
        this.listaSali = listaSali;
    }
}
