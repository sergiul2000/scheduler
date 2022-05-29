package controllers;

import Services.RezervareService;
import model.Rezervare;
import model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rezervare")
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

    @GetMapping("/allRezervari")
    public List<Rezervare> getRezervare(){
        //System.out.println("am ajuns aici");
        return rezervareService.getRezervari();
    }

    @PostMapping("/addRezervare")
    public Rezervare createRezervare(@RequestBody Rezervare rezervare){
        return rezervareService.addRezervare(rezervare);
    }

    @PostMapping("/deleteRezervare/{id}")
    public void deleteRezervareById(@PathVariable int id){
        rezervareService.deleteRezervare(id);
    }


}
