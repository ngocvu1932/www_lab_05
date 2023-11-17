package vn.edu.iuh.fit.www_lab_05.backend.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", columnDefinition = "bigint(20)")
    private long id;

    @Column(name = "job_name", columnDefinition = "varchar(255)")
    private String name;

    @ManyToOne
    @JoinColumn(name = "company", columnDefinition = "bigint(20)")
    private Company company;

    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;

    @Column(name = "job_desc", columnDefinition = "varchar(2000)")
    private String description;

    public Job() {
    }

    public Job(long id, String name, Company company, List<JobSkill> jobSkills, String description) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.jobSkills = jobSkills;
        this.description = description;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<JobSkill> getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(List<JobSkill> jobSkills) {
        this.jobSkills = jobSkills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company=" + company +
                ", jobSkills=" + jobSkills +
                ", description='" + description + '\'' +
                '}';
    }
}
