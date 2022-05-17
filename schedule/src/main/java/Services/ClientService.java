package Services;

import model.Client;

import java.util.List;

public interface ClientService {
    Client findById(Long id);
    Client findByName(String username);
    Client add(Client client);
    List<Client> listAll();
    void remove(Long id);
    Client update(Client client);
}
