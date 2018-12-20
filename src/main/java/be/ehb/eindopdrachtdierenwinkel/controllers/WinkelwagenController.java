package be.ehb.eindopdrachtdierenwinkel.controllers;

import be.ehb.eindopdrachtdierenwinkel.model.ProductRepository;
import be.ehb.eindopdrachtdierenwinkel.model.WinkelWagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class WinkelwagenController {
@Autowired
private ProductRepository repo;

@RequestMapping(value = "/Winkelwagen)",method = RequestMethod.GET)
public String getCart(ModelMap map){

    map.addAttribute("cart", WinkelWagen.getInstance().getCart());

    return "Details";
}

}
