package Services;

import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.ClientRepo;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client findById(int id) {
        return clientRepo.findById(id).get();
    }


    @Override
    public Client addClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public List<Client> getClients() {
        return clientRepo.findAll();
    }

    @Override
    public void deleteClient(int id) {
        clientRepo.delete(clientRepo.findById(id).get());
    }

}
