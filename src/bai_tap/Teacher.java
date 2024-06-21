package bai_tap;

public class Teacher extends Person {
    private String specialization;

    public Teacher(String id, String name, String birthDate, String gender, String specialization) {
        super(id, name, birthDate, gender);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
