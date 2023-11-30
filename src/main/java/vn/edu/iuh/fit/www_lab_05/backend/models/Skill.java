package vn.edu.iuh.fit.www_lab_05.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_05.backend.enums.SkillType;

import java.util.List;

@Entity
@Table(name="skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;

    @Column(name = "skill_type", columnDefinition = "tinyint(4)")
    private SkillType type;

    @Column(name = "skill_name", columnDefinition = "varchar(150)")
    private String skillName;

    @Column(name = "skill_desc", columnDefinition = "varchar(300)")
    private String skillDescription;

    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

    public Skill() {
    }

    public Skill(long id, SkillType type, String skillName, String skillDescription, List<JobSkill> jobSkills) {
        this.id = id;
        this.type = type;
        this.skillName = skillName;
        this.skillDescription = skillDescription;
        this.jobSkills = jobSkills;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public List<JobSkill> getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(List<JobSkill> jobSkills) {
        this.jobSkills = jobSkills;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", type=" + type +
                ", skillName='" + skillName + '\'' +
                ", skillDescription='" + skillDescription + '\'' +
                ", jobSkills=" + jobSkills +
                '}';
    }
}
