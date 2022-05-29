package controllers;

import logic.AdminLogic;
import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    private AdminLogic adminLogic;

    @RequestMapping(method = RequestMethod.GET,value = "/getAdmins")
    public List<Admin> getAdmins(){
        return adminLogic.getAdmins();
    }

}
