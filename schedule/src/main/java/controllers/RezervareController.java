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
    public Rezervare findById(@PathVariable int id){
        return rezervareService.findById(id);
    }

    @GetMapping("/all")
    public List<Rezervare> getRezervare(){
        //System.out.println("am ajuns aici");
        return rezervareService.getRezervari();
    }

    @PostMapping("/addSala")
    public Rezervare createRezervare(@RequestBody Rezervare rezervare){
        return rezervareService.addRezervare(rezervare);
    }

    @PostMapping("/deleteSala/{id}")
    public void deleteRezervareById(@PathVariable int id){
        rezervareService.deleteRezervare(id);
    }


}
