package vn.edu.iuh.fit.www_lab_05.backend.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id", columnDefinition = "bigint(20)")
    private long id;

    @Column(name = "comp_name", columnDefinition = "varchar(255)")
    private String name;

    @Column(name = "about", columnDefinition = "varchar(2000)")
    private String about;

    @ManyToOne
    @JoinColumn(name="address", columnDefinition = "bigint(20)")
    private Address address;

    @Column(name = "phone", columnDefinition = "varchar(255)")
    private String phone;

    @Column(name = "web_url", columnDefinition = "varchar(255)")
    private String webURL;

    @OneToMany(mappedBy = "company")
    private List<Job> jobs;

    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;

    public Company() {
    }

    public Company(long id, String name, String about, Address address, String phone, String webURL, String email) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.address = address;
        this.phone = phone;
        this.webURL = webURL;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", webURL='" + webURL + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
