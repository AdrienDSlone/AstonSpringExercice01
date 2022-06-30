package aston.springexo1.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Adress")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="street", nullable = false)
    @NotNull
    @Size(max=255)
    private String street;
    @Column(name="complement", nullable = false)
    @NotNull
    @Size(max=255)
    private String complement;
    @Column(name="zipcode", nullable = false)
    @NotNull
    @Size(max=10)
    private String zipcode;
    @Column(name="city", nullable = false)
    @NotNull
    @Size(max=100)
    private String city;
    @Column(name="country", nullable = false)
    @NotNull
    @Size(max=100)
    private String country;

    public Adress() {
    }

    public Adress(int id, String street, String complement, String zipcode, String city, String country) {
        this.id = id;
        this.street = street;
        this.complement = complement;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
