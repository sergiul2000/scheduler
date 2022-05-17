package Services;

import model.Client;
import org.springframework.stereotype.Service;
import repos.ClientRepo;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    private ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client findById(Long id) {
        return clientRepo.findById(id).get();
    }

    @Override
    public Client findByName(String username) {
        List<Client> clients = clientRepo.findAll();
        for(Client c : clients){
            if(c.getUsername().equals(username)){
                System.out.println(c.toString());
                return c;
            }
        }
        return null;
    }

    @Override
    public Client add(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public List<Client> listAll() {
        return clientRepo.findAll();
    }

    @Override
    public void remove(Long id) {
        clientRepo.delete(clientRepo.findById(id).get());
    }

    @Override
    public Client update(Client updated) {
        Client client = clientRepo.findById(updated.getId()).get();
        client.setUsername(updated.getUsername());
        client.setPassword(updated.getPassword());
        return clientRepo.save(client);
    }
}
