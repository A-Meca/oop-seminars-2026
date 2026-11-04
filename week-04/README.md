# Week 4 · Your first classes

*Module: Objects and State*

## Before the seminar

* Read the seminar: [Seminar 2. Your first classes](https://evisp.github.io/java-oop-course/01-objects-and-state/seminar-2/)
* Read the specification: [The university system](https://evisp.github.io/java-oop-course/01-objects-and-state/university-system/). Use the class names, field names and method names from this page exactly as they are written.
* Review the lectures: [Your first class](https://evisp.github.io/java-oop-course/01-objects-and-state/first-class/) · [What a variable really holds](https://evisp.github.io/java-oop-course/01-objects-and-state/references/)

## Building each class

Finish one class completely before you start the next one. For each class:

1. Write the attribute fields. All of them are `private`.
2. Write one constructor that takes everything the object needs. Do not write an empty constructor.
3. Write the getters. Write a setter **only** when the specification says the value **can change**.
4. Write the behaviour methods, such as `academicStanding()` and `academicTitle()`.
5. Write `toString()`, with `@Override` above it.

## Common mistakes

* **Forgetting `this`.** If you write `name = name` in the constructor, the parameter is assigned to itself. The field is never set and stays `null`.
* **Setters that should not exist.** `studentId`, `employeeId`, `courseCode`, `roomNumber` and `building` never change, so they have no setter. Eclipse's *Generate Getters and Setters* creates a setter for every field. Delete the ones that should not be there.
* **Conditions in the wrong order.** Test a student with a GPA of 1.2 and one with 3.5. If both get the same standing, check the order of your `if` conditions.

## Drill: two names, one object

**Write down your prediction on paper before you run each block.** For every prediction you got wrong, draw boxes for the objects and arrows for the variables until the drawing explains the output.



**One**

```java
Student a = new Student("S-1001", "Ada Lovelace", 3.9, 2024);
Student b = a;
b.setName("Ada L.");
System.out.println(a.getName());
```

**Two**

```java
Student x = new Student("S-1001", "Ada Lovelace", 3.9, 2024);
Student y = new Student("S-1001", "Ada Lovelace", 3.9, 2024);
System.out.println(x == y);
System.out.println(x.getStudentId() == y.getStudentId());
System.out.println(x.getStudentId().equals(y.getStudentId()));
```

**Three**

```java
Student nobody = null;
System.out.println(nobody == null);
System.out.println(nobody.getName());
```

**Four**

```java
public static void promote(Student student) {
    student.updateGpa(4.0);
}

public static void replace(Student student) {
    student = new Student("S-9999", "Nobody", 0.0, 2024);
}
```

Call both methods with the same student. After each call, print the student's GPA and name.

&#x20;

## Solutions

[Sample Solutions](Sample%20Solutions), published after the seminar

