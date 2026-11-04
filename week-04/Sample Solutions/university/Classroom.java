package university;

public class Classroom {
    private String roomNumber;
    private String building;
    private int capacity;
    private boolean hasProjector;

    public Classroom(String roomNumber, String building, int capacity, boolean hasProjector) {
        this.roomNumber = roomNumber;
        this.building = building;
        this.capacity = capacity;
        this.hasProjector = hasProjector;
    }

    public String getRoomNumber() { return roomNumber; }
    public String getBuilding() { return building; }
    public int getCapacity() { return capacity; }
    public boolean hasProjector() { return hasProjector; }

    public void setHasProjector(boolean hasProjector) { this.hasProjector = hasProjector; }

    public boolean canAccommodate(int numberOfStudents) {
        return numberOfStudents <= capacity;
    }

    public boolean isLargeRoom() {
        return capacity > 50;
    }

    public String location() {
        return "Building " + building + ", Room " + roomNumber;
    }

    @Override
    public String toString() {
        return "Classroom[" + location() + ", capacity " + capacity
                + (hasProjector ? ", projector" : ", no projector") + "]";
    }
}
