package vn.edu.iuh.fit.www_lab_05.backend.enums;

public enum SkillLevel {
    MASTER(1),
    BEGINNER(2),
    ADVANCED(3),
    PROFESSIONAL(4),
    INTERMEDIATE(5);

    private int value;

    SkillLevel (int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
