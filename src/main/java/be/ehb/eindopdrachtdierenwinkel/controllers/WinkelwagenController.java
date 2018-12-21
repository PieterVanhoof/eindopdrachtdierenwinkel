package be.ehb.eindopdrachtdierenwinkel.controllers;

import be.ehb.eindopdrachtdierenwinkel.model.Product;
import be.ehb.eindopdrachtdierenwinkel.model.ProductRepository;
import be.ehb.eindopdrachtdierenwinkel.model.WinkelWagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WinkelwagenController {
    @Autowired
    private ProductRepository repo;

    //manier waarmee we de winkelwagen aanmaken
    @RequestMapping(value = "/winkelwagen", method = RequestMethod.GET)
    public String getCart(ModelMap map) {

        map.addAttribute("cart", WinkelWagen.getInstance().getCart());

        return "Winkelwagen";
    }

    //methode waarmee we producten op id naar de winkelwagen sturen
    @RequestMapping(value = "/winkelwagen/{id}", method = RequestMethod.GET)
    public String AddToCart(ModelMap map, @PathVariable(name = "id") int id) {

        Product p = repo.findById(id).get();
        WinkelWagen.getInstance().addProduct(p);


        map.addAttribute("cart", WinkelWagen.getInstance().getCart());
        return "redirect:/winkelwagen";
    }

    //methode waarop we op id dingen verweideren uit de winkelwagen
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable(value = "id") int id) {
        Product p = repo.findById(id).get();
        WinkelWagen.getInstance().delProduct(p);
        return "redirect:/winkelwagen";
    }
}



