package be.ehb.eindopdrachtdierenwinkel.model;

import java.util.ArrayList;

public class WinkelWagen {
    //singleton pattern
    private static WinkelWagen ourInstance = new WinkelWagen();

    public static WinkelWagen getInstance() {
        return ourInstance;
    }

    private WinkelWagen() {
    }

    //own stuff
    private ArrayList<Product> cart = new ArrayList<>();

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void addProduct(Product p){
        cart.add(p);
    }
}
