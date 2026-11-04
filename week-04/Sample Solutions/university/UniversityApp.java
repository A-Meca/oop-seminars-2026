package university;

public class UniversityApp {

    public static void main(String[] args) {
    	
        // Test Classroom
        Classroom small = new Classroom("205", "A", 30, true);
        Classroom hall = new Classroom("301", "D", 120, false);
        System.out.println(small);
        System.out.println(hall);
        System.out.println(small.location());
        System.out.println("Can small fit 25 students? " + small.canAccommodate(25));
        System.out.println("Can small fit 40 students? " + small.canAccommodate(40));
        System.out.println("Is hall large? " + hall.isLargeRoom());
        hall.setHasProjector(true);
        System.out.println(hall);

        // Test Students
        Student ada = new Student("S-1001", "Ada Lovelace", 3.8, 2025);
        Student alan = new Student("S-1002", "Alan Turing", 1.6, 2024);
        System.out.println(ada);
        System.out.println(alan);
        System.out.println(ada.getName() + " years enrolled: " + ada.yearsEnrolled(2026));
        System.out.println(ada.getName() + ": " + ada.academicStanding());
        System.out.println(alan.getName() + ": " + alan.academicStanding());
        alan.updateGpa(3.2);
        System.out.println(alan.getName() + " after update: " + alan.academicStanding());


        // Test Professors 
        Professor grace = new Professor("P-1001", "Grace Hopper", "Compilers", 12);
        Professor dijkstra = new Professor("P-1002", "Edsger Dijkstra", "Algorithms", 5);
        System.out.println(grace);
        System.out.println(dijkstra);
        System.out.println(dijkstra.getName() + " experienced? " + dijkstra.isExperienced());
        dijkstra.completeAnotherYear();
        System.out.println(dijkstra.getName() + " after a year: " + dijkstra.academicTitle()
                + ", experienced? " + dijkstra.isExperienced());

        // Test Courses
        Course cs101 = new Course("CS101", "Introduction to Programming", 6, "Fall 2026");
        Course cs105 = new Course("CS105", "Seminar in Ethics", 2, "Spring 2026");
        System.out.println(cs101);
        System.out.println(cs105);
        System.out.println(cs101.fullName() + " is major course? " + cs101.isMajorCourse());
        System.out.println(cs105.fullName() + "is major course? " + cs105.isMajorCourse());

        // Test Department
        Department cs = new Department("Computer Science", "A", "Grace Hopper");
        System.out.println(cs);

        // ---- Drill ----
        System.out.println("\n--- Drill one ---");
        Student a = new Student("S-1001", "Ada Lovelace", 3.9, 2024);
        Student b = a;
        b.setName("Ada L.");
        System.out.println(a.getName());

        System.out.println("--- Drill two ---");
        Student x = new Student("S-1001", "Ada Lovelace", 3.9, 2024);
        Student y = new Student("S-1001", "Ada Lovelace", 3.9, 2024);
        System.out.println(x == y);
        System.out.println(x.getStudentId() == y.getStudentId());
        System.out.println(x.getStudentId().equals(y.getStudentId()));

        System.out.println("--- Drill four ---");
        Student s = new Student("S-1003", "Barbara Liskov", 2.5, 2024);
        promote(s);
        System.out.println(s.getGpa() + " " + s.getName());
        replace(s);
        System.out.println(s.getGpa() + " " + s.getName());

        System.out.println("--- Drill three ---");
        Student nobody = null;
        System.out.println(nobody == null);
        System.out.println(nobody.getName());   // crashes here
    }

    public static void promote(Student student) {
        student.updateGpa(4.0);
    }

    public static void replace(Student student) {
        student = new Student("S-9999", "Nobody", 0.0, 2024);
    }
}
