package finalattributes;

/** Slide 41: final attributes can be initialized inline or by the constructor. */

class Student {
  final int years = 3;
  final String id;

  public Student(String id) {
    this.id = id;
  }
}
