package vn.edu.iuh.fit.www_lab_05.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_05.backend.enums.SkillLevel;

@Entity
@Table(name="job_skill")
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id", columnDefinition = "bigint(20)")
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id", columnDefinition = "bigint(20)")
    private Skill skill;

    @Column(name = "shill_level", columnDefinition = "tinyint(4)")
    private SkillLevel skillLevel;

    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;

    public JobSkill(Job job, Skill skill, SkillLevel skillLevel, String moreInfo) {
        this.job = job;
        this.skill = skill;
        this.skillLevel = skillLevel;
        this.moreInfo = moreInfo;
    }

    public JobSkill() {
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public String toString() {
        return "JobSkill{" +
                "job=" + job +
                ", skill=" + skill +
                ", skillLevel=" + skillLevel +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }
}
