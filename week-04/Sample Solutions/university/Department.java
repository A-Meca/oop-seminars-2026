package university;

public class Department {
    private String name;
    private String building;
    private String headName;

    public Department(String name, String building, String headName) {
        this.name = name;
        this.building = building;
        this.headName = headName;
    }

    public String getName() { return name; }
    public String getBuilding() { return building; }
    public String getHeadName() { return headName; }

    public void setBuilding(String building) { this.building = building; }
    public void setHeadName(String headName) { this.headName = headName; }

    @Override
    public String toString() {
        return "Department[" + name + ", Building " + building + ", head " + headName + "]";
    }
}
