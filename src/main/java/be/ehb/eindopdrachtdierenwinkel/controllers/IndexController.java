package be.ehb.eindopdrachtdierenwinkel.controllers;

import be.ehb.eindopdrachtdierenwinkel.model.Product;
import be.ehb.eindopdrachtdierenwinkel.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.Query;


@Controller
public class IndexController {
    @Autowired
    private ProductRepository repo;
    //manier waarmee we alle producten weergewen op de indexpagina
    @ModelAttribute("all")
    public Iterable<Product> findAll(){return repo.findAll();}
    @RequestMapping(value = {"/index","/"},method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }

    //manier waarop we filteren op categore
    @RequestMapping(value = {"/index/{cat}"},method = RequestMethod.GET)
    public String showIndexCategorie(ModelMap map, @PathVariable(value = "cat") String cat) {

        map.addAttribute("all", repo.findByCategorieIgnoreCase(cat));


        return "index";
    }


}

