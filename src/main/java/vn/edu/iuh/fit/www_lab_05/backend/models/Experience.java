package vn.edu.iuh.fit.www_lab_05.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;

    @Column(name = "to_date", columnDefinition = "date")
    private LocalDate toDate;

    @ManyToOne
    @JoinColumn(name = "can_id", columnDefinition = "bigint(20)")
    private Candidate candidate;

    @Column(name = "from_date", columnDefinition = "date")
    private LocalDate fromDate;

    @Column(name = "company", columnDefinition = "varchar(120)")
    private String companyName;

    @Column(name = "role", columnDefinition = "varchar(100)")
    private String role;

    @Column(name = "work_desc", columnDefinition = "varchar(400)")
    private String workDescription;


    public Experience() {
    }

    public Experience(long id, LocalDate toDate, Candidate candidate, LocalDate fromDate, String companyName, String role, String workDescription) {
        this.id = id;
        this.toDate = toDate;
        this.candidate = candidate;
        this.fromDate = fromDate;
        this.companyName = companyName;
        this.role = role;
        this.workDescription = workDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", toDate=" + toDate +
                ", candidate=" + candidate +
                ", fromDate=" + fromDate +
                ", companyName='" + companyName + '\'' +
                ", role='" + role + '\'' +
                ", workDescription='" + workDescription + '\'' +
                '}';
    }
}
