package be.ehb.eindopdrachtdierenwinkel.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//classe gebruiker voor het invul formulier
public class Gebruiker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "{validation.post}")
    private int naam;
    @NotBlank(message = "{validation.post}")
    @Size(min = 4, max = 20, message = "{validation.email}")
    private String email;
    @NotBlank(message = "{validation.post}")
    private String adres;
    @NotBlank(message = "{validation.post}")
    private String bus;
    @NotBlank(message = "{validation.post}")
    private int postcode;
    @NotBlank(message = "{validation.post}")
    private String woonplaats;

    public int getNaam() {
        return naam;
    }

    public void setNaam(int naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
}
