package vn.edu.iuh.fit.www_lab_05.backend.enums;

public enum SkillType {
    SOFT_SKILL(1),
    UNSPECIFIC(2),
    TECHNICAL_SKILL(3);

    private int value;
    SkillType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
