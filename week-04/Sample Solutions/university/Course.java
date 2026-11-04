package university;

public class Course {
    private String courseCode;
    private String title;
    private int credits;
    private String semester;

    public Course(String courseCode, String title, int credits, String semester) {
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
        this.semester = semester;
    }

    public String getCourseCode() { return courseCode; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public String getSemester() { return semester; }

    public void setTitle(String title) { this.title = title; }
    public void setCredits(int credits) { this.credits = credits; }
    public void setSemester(String semester) { this.semester = semester; }

    public String fullName() {
        return courseCode + ": " + title;
    }

    public boolean isMajorCourse() {
        return credits >= 3;
    }

    @Override
    public String toString() {
        return "Course[" + fullName() + ", " + credits + " credits, " + semester + "]";
    }
}
