package vn.edu.iuh.fit.www_lab_05.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_05.backend.enums.Country;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id", columnDefinition = "bigint(20)")
    private long id;

    @Column(name="city", columnDefinition = "varchar(50)")
    private String city;

    @Column(name="country", columnDefinition = "smallint(6)")
    private Country country;

    @Column(name="zipcode", columnDefinition = "varchar(7)")
    private String zipcode;

    @Column(name="street", columnDefinition = "varchar(50)")
    private String street;

    @Column(name="number", columnDefinition = "varchar(20)")
    private String number;

//    @OneToMany()
//    private Company company;
//
//    @OneToMany(mappedBy = "address")
//    private Candidate candidate;

    public Address() {
    }

    public Address(long id, String city, Country country, String zipcode, String street, String number) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
        this.street = street;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country=" + country +
                ", zipcode='" + zipcode + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
