# Week 4 · Sample Solutions

All the classes are in the [`university`](university) package. The class and method names follow [the university system specification](https://evisp.github.io/java-oop-course/01-objects-and-state/university-system/). The tasks are in [Seminar 2](https://evisp.github.io/java-oop-course/01-objects-and-state/seminar-2/).

|File|
|-|
|[`Classroom.java`](university/Classroom.java)|
|[`Student.java`](university/Student.java)|
|[`Professor.java`](university/Professor.java)|
|[`Course.java`](university/Course.java)|
|[`Department.java`](university/Department.java)|
|[`UniversityApp.java`](university/UniversityApp.java)|

Every class follows the same rules:

* All fields are `private`.
* There is one constructor, and it sets every field using `this`.
* A field that never changes has a getter and no setter.
* No class prints anything. `toString()` and the other methods **return** text, and only `main` prints it.

## The classes

### `Classroom`

|Field|Getter|Setter|
|-|-|-|
|`roomNumber`, `building`|yes|no, because a room does not move|
|`capacity`|yes|no|
|`hasProjector`|`hasProjector()`|`setHasProjector()`, because equipment can change|

* `canAccommodate(n)` returns `true` if `n` is at most the capacity.
* `isLargeRoom()` returns `true` if the capacity is more than 50.
* `location()` returns text such as `"Building A, Room 205"`.



### `Student`

|Field|Getter|Setter|
|-|-|-|
|`studentId`, `enrolmentYear`|yes|no, because these never change|
|`name`|yes|`setName()`|
|`gpa`|yes|no setter. Use `updateGpa()` instead|

* `academicStanding()` returns "Good standing" when the GPA is 2.0 or higher, "Academic probation" from 1.5 up to 2.0, and "Academic warning" below 1.5.
* `yearsEnrolled(currentYear)` returns `currentYear - enrolmentYear`.



### `Professor`

|Field|Getter|Setter|
|-|-|-|
|`employeeId`|yes|no|
|`name`, `specialisation`|yes|yes|
|`yearsOfExperience`|yes|no setter. Use `completeAnotherYear()` instead|

* `academicTitle()` returns "Professor" for more than 10 years, "Associate Professor" for 6 to 10 years, and "Assistant Professor" for up to 5 years.
* `isExperienced()` returns `true` for more than 5 years.
* `completeAnotherYear()` adds one year.



### `Course`

|Field|Getter|Setter|
|-|-|-|
|`courseCode`|yes|no|
|`title`, `credits`, `semester`|yes|yes|

* `fullName()` returns text such as `"CS101: Introduction to Programming"`.
* `isMajorCourse()` returns `true` for 3 credits or more.

### `Department`

`name` has only a getter. `building` and `headName` have setters. The class has only a `toString()` method so far. In later seminars a department will hold its professors.

### Why `@Override`?

Every class already has a `toString()` method that it inherits from `Object`, and that method prints something like `university.Student@1b6d3586`. When we write our own `toString()`, it replaces the inherited one. `@Override` asks the compiler to check this. If you misspell the name, for example `toSting()`, the compiler reports an error. Without `@Override`, the misspelled method compiles as a new method and the student still prints as `Student@...`.

## Drill answers

|Block|Output|Why|
|-|-|-|
|One|`Ada L.`|`b = a` copies the reference, not the object. There is one student, and both `a` and `b` refer to it.|
|Two, line 1|`false`|`new` is called twice, so these are two different objects. `==` compares references, not contents.|
|Two, line 2|`true`|This answer surprises most people. Both IDs come from the same string literal `"S-1001"`, and Java stores identical string literals only once. So both fields refer to the same `String` object. This works only by accident. If the ID were read from the keyboard, `==` would return `false`.|
|Two, line 3|`true`|`equals` compares the contents of the strings. **Always compare Strings with `equals`.**|
|Three|`true`, then a `NullPointerException`|`nobody` does not refer to any object, so there is nothing to call `getName()` on. The program stops at that line.|
|Four, after `promote`|`4.0 Barbara Liskov`|The method receives a copy of the reference. The copy refers to the same student, so changing the GPA changes the caller's student.|
|Four, after `replace`|`4.0 Barbara Liskov`|The method changes only its own copy of the reference so that it refers to a new student. The caller's variable still refers to the original student, so nothing changes.|



