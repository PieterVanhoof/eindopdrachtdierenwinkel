package be.ehb.eindopdrachtdierenwinkel.controllers;

import be.ehb.eindopdrachtdierenwinkel.model.Product;
import be.ehb.eindopdrachtdierenwinkel.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @Autowired
    private ProductRepository repo;

    @ModelAttribute("all")
    public Iterable<Product> findAll(){return repo.findAll();}
    @RequestMapping(value = {"/index","/"},method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }
}
