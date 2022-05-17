package controllers;

import Services.ClientService;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id){
        return clientService.findById(id);
    }

    @GetMapping("/getClient")
    public Client getClientByName(@RequestBody Client client){
        return clientService.findByName(client.getUsername());
    }

    @GetMapping("/all")
    public List<Client> getClient(){
        return clientService.listAll();
    }

    @PostMapping("/addClient")
    public Client createClient(@RequestBody Client client){
        return clientService.add(client);
    }

    @PostMapping("/deleteClient/{id}")
    public void deleteClientById(@PathVariable Long id){
        clientService.remove(id);
    }
    @PostMapping("/updateClient")
    public Client updateClient(@RequestBody Client client){
        return clientService.update(client);
    }



}
