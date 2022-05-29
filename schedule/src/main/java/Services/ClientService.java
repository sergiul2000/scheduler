package Services;

import model.Client;

import java.util.List;

public interface ClientService {
    Client findById(int id);
    Client addClient(Client client);
    List<Client> getClients();
    void deleteClient(int id);
}
