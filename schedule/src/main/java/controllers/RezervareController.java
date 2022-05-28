package controllers;

import Services.RezervareService;
import model.Rezervare;
import model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rezervare")
public class RezervareController {
    @Autowired
    private RezervareService rezervareService;

    public RezervareController(RezervareService rezervareService) {
        this.rezervareService = rezervareService;
    }


    @GetMapping("/{id}")
    public Rezervare getRezervareById(@PathVariable int id){
        return rezervareService.findById(id);
    }

    @GetMapping("/all")
    public List<Rezervare> getRezervare(){
        System.out.println("am ajuns aici");
        return rezervareService.listAll();
    }

    @PostMapping("/addSala")
    public Rezervare createRezervare(@RequestBody Rezervare rezervare){
        return rezervareService.add(rezervare);
    }

    @PostMapping("/deleteSala/{id}")
    public void deleteRezervareById(@PathVariable int id){
        rezervareService.remove(id);
    }
    @PostMapping("/updateSala")
    public Rezervare updateRezervare(@RequestBody Rezervare rezervare){
        return rezervareService.update(rezervare);
    }


}
