package university;

public class Professor {
    private String employeeId;
    private String name;
    private String specialisation;
    private int yearsOfExperience;

    public Professor(String employeeId, String name, String specialisation, int yearsOfExperience) {
        this.employeeId = employeeId;
        this.name = name;
        this.specialisation = specialisation;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getSpecialisation() { return specialisation; }
    public int getYearsOfExperience() { return yearsOfExperience; }

    public void setName(String name) { this.name = name; }
    public void setSpecialisation(String specialisation) { this.specialisation = specialisation; }

    public String academicTitle() {
        if (yearsOfExperience > 10) {
            return "Professor";
        } else if (yearsOfExperience >= 6) {
            return "Associate Professor";
        } else {
            return "Assistant Professor";
        }
    }

    public boolean isExperienced() {
        return yearsOfExperience > 5;
    }

    public void completeAnotherYear() {
        yearsOfExperience++;
    }

    @Override
    public String toString() {
        return "Professor[" + employeeId + ", " + name + ", " + academicTitle()
                + ", " + specialisation + ", " + yearsOfExperience + " years]";
    }
}
