package vn.edu.iuh.fit.www_lab_05.backend.enums;

public enum SkillLevel {
    MASTER(0),
    BEGINNER(1),
    ADVANCED(2),
    PROFESSIONAL(3),
    INTERMEDIATE(4);

    private int value;

    SkillLevel (int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
