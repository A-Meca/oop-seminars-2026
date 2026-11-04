package finalattributes;

/** Slide 41: a final attribute cannot be changed after object construction. */

public class TestStudent {
  public static void main(String[] args) {
    Student student = new Student("S001");
    System.out.println("id: " + student.id + ", years: " + student.years);

    // WRONG: student.id = "S002"; // Cannot be changed after construction
    // WRONG: student.years = 4; // Cannot be changed after construction
  }
}
