package controllers;

import Services.SalaService;
import model.Client;
import model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sala")
public class SalaController {
    @Autowired
    private SalaService salaService;

    public SalaController(SalaService salaService) {
        this.salaService = salaService;
    }

    @GetMapping("/{id}")
    public Sala getSalaById(@PathVariable int id){
        return salaService.findById(id);
    }

    @GetMapping("/all")
    public List<Sala> getSala(){
        return salaService.listAll();
    }

    @PostMapping("/addSala")
    public Sala createSala(@RequestBody Sala sala){
        return salaService.add(sala);
    }

    @PostMapping("/deleteSala/{id}")
    public void deleteSalaById(@PathVariable int id){
        salaService.remove(id);
    }
    @PostMapping("/updateSala")
    public Sala updateSala(@RequestBody Sala sala){
        return salaService.update(sala);
    }


}
