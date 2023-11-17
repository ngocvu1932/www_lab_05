package vn.edu.iuh.fit.www_lab_05.backend.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.www_lab_05.backend.enums.SkillLevel;

@Entity
@Table(name="candidate_skill")
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id", columnDefinition = "bigint(20)")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name="can_id", columnDefinition = "bigint(20)")
    private Candidate candidate;

    @Column(name = "skill_level", columnDefinition = "tinyint(4)")
    private SkillLevel skillLevel;

    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;

    public CandidateSkill() {
    }

    public CandidateSkill(Skill skill, Candidate candidate, SkillLevel skillLevel, String moreInfo) {
        this.skill = skill;
        this.candidate = candidate;
        this.skillLevel = skillLevel;
        this.moreInfo = moreInfo;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
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
        return "CandidateSkill{" +
                "skill=" + skill +
                ", candidate=" + candidate +
                ", skillLevel=" + skillLevel +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }
}
