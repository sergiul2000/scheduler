package controllers;

import Services.ClientService;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/client")
@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id){
        return clientService.findById(id);
    }

    @GetMapping("/allClients")
    public List<Client> getClient(){
        return clientService.getClients();
    }

    @PostMapping("/addClient")
    public Client createClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    @PostMapping("/deleteClient/{id}")
    public void deleteClientById(@PathVariable int id){
        clientService.deleteClient(id);
    }



}
