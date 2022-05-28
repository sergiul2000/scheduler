package Services;

import model.Client;

import java.util.List;

public interface ClientService {
    Client findById(int id);
    Client findByName(String username);
    Client add(Client client);
    List<Client> getAll();
    void remove(int id);
    Client update(Client client);
}
