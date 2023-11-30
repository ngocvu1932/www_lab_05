package vn.edu.iuh.fit.www_lab_05.backend.enums;

public enum SkillType {
    SOFT_SKILL(0),
    UNSPECIFIC(1),
    TECHNICAL_SKILL(2);

    private int value;
    SkillType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
