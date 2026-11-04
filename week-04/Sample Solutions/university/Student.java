package university;

public class Student {
    private String studentId;
    private String name;
    private double gpa;
    private int enrolmentYear;

    public Student(String studentId, String name, double gpa, int enrolmentYear) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.enrolmentYear = enrolmentYear;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public int getEnrolmentYear() { return enrolmentYear; }

    public void setName(String name) { this.name = name; }

    public void updateGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public String academicStanding() {
        if (gpa >= 2.0) {
            return "Good standing";
        } else if (gpa >= 1.5) {
            return "Academic probation";
        } else {
            return "Academic warning";
        }
    }

    public int yearsEnrolled(int currentYear) {
        return currentYear - enrolmentYear;
    }

    @Override
    public String toString() {
        return "Student[" + studentId + ", " + name + ", GPA " + gpa
                + ", enrolled " + enrolmentYear + "]";
    }
}
