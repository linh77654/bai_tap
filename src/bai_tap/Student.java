package bai_tap;

public class Student extends Person {
     private String className;
     private double score;

    public Student(String id, String name, String birthDate, String gender, String className, double score) {
        super(id, name, birthDate, gender);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
