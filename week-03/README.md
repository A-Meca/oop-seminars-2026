# Objects and Classes: Code Examples

These examples go with the **["Objects and Classes" slides](https://github.com/A-Meca/oop-seminars-2026/blob/main/week-03/Objects_and_Classes.pdf)**. There are four packages, and each one groups a topic's classes with the programs that test them.

| Package | Topic | Slides |
| --- | --- | --- |
| [`tv`](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/tv) | Defining a class and creating objects | 5-6 |
| [`circle`](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/circle) | Encapsulation, static members, references and arrays of objects | 2-4, 8, 10-11, 13-19, 33-34, 48-52 |
| [`car`](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/car) | Attributes, methods, references and aliasing | 7, 12, 21-26, 40 |
| [`finalattributes`](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/finalattributes) | Attributes that cannot change | 41 |

A class such as `TV` describes what an object is, and it does nothing by itself. A test such as `TestTV` has a `main` method, which is where the program starts. It creates objects and uses them.

The packages are as below:

## 1. `TV`: a first sample class

**Files:** `TV.java`, `TestTV.java` ([open the folder](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/tv))

### `TV`

`TV` follows the UML diagram on slide 5.

- **State:** each TV object has its own `channel`, `volumeLevel` and `on` values.
- **Behavior:** methods such as `turnOn()` and `channelUp()` change that state.
- **Rules:** the methods work only when the TV is on and the new value is in range.

### `TestTV`

This program creates two TVs and changes them in different ways.

**Key idea:** one class can create many objects, and each object has its own state.

**Try it:** remove `tv1.turnOn();` and predict the output before you run it.

## 2. `circle`: Encapsulation and arrays of objects

**Files:** `Circle.java`, `TestCircle.java`, `TestCircleArray.java` ([open the folder](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/circle))

### `Circle`

Implements the `Circle` class as shown on slides 49-50.

| Member | Visibility | Purpose |
| --- | --- | --- |
| `radius` | `private` | The radius of this circle. The default is 1.0. |
| `numberOfObjects` | `private static` | How many circles have been created. All circles share this value. |
| `Circle()` | `public` | Creates a circle with the default radius. |
| `Circle(double newRadius)` | `public` | Creates a circle with the given radius. |
| `getRadius()` | `public` | Reads the radius. |
| `setRadius(double newRadius)` | `public` | Changes the radius. |
| `getArea()` | `public` | Calculates the area. |
| `getPerimeter()` | `public` | Calculates the perimeter. |
| `getNumberOfObjects()` | `public static` | Reads the shared counter. |

Because `radius` is `private`, other classes can't access it directly. They have to use `getRadius()` and `setRadius()` called from an instance of class Circle.

### `TestCircle`

This program tests both the instance and the static members of `Circle`.

1. It calls `Circle.getNumberOfObjects()` before any circle exists. The result is 0, because static members belong to the class and not to an object.
2. It creates `myCircle` with radius 5.0, then prints its radius and the number of circles, which is 1.
3. It creates `yourCircle` with the default radius of 1.0, then prints its radius and the number of circles, which is now 2.
4. It calls `myCircle.getNumberOfObjects()`. The result is also 2, even though `myCircle` was created when the count was 1, because all objects share one static value.
5. It changes only `yourCircle`, using `setRadius(100)`. `myCircle` hasn't changed, because it is a separate object.
6. It prints the area and perimeter of both circles. These instance methods use the radius of the object they are called on.

```text
Circles before creating objects: 0

After creating myCircle:
myCircle radius: 5.0
Number of circles: 1

After creating yourCircle:
yourCircle radius: 1.0
Number of circles: 2

Number of circles, called from myCircle: 2

After yourCircle.setRadius(100):
myCircle radius: 5.0
yourCircle radius: 100.0

myCircle area: 78.53981633974483
myCircle perimeter: 31.41592653589793
yourCircle area: 31415.926535897932
yourCircle perimeter: 628.3185307179587
```

**Note:** slide 19 writes `yourCircle.radius = 100;`. Here `radius` is private, so the code calls `yourCircle.setRadius(100);` instead.

**Try it:** `TestCircle` contains two error lines marked `// WRONG:`

- `Circle.getRadius();` fails because `getRadius()` is an instance method. It needs to be called from an object, because each circle has its own radius.
- `yourCircle.radius = 100;` fails because `radius` is private.

### `TestCircleArray`

This program shows that an array of objects is really an array of references (slide 51).

1. `new Circle[10]` creates space for 10 references, but no circles yet.
2. That is why `circleArray[0]` prints `null`.
3. The loop creates one `Circle` for each position, with radius 1 to 10.

```text
Length: 10
circleArray[0]: null
circleArray[0] radius: 1.0
circleArray[9] radius: 10.0
Number of circles: 10
```

**Try it:** move the line that prints `circleArray[0] radius` above the loop. The program compiles but crashes with a `NullPointerException`, because there is no object to call `getRadius()` on.

## 3. `car`: Objects and references

**Files:** `Car.java`, `TestCar.java` ([open the folder](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/car))

### `Car`

| Part of `Car` | Slide | Purpose |
| --- | --- | --- |
| `color`, `brand`, `turnedOn` | 7 | The state of each car. |
| `turnOn()`, `paint(String newCol)`, `printState()` | 7 | Change or display the state. |
| `paint()` | 12 | Paints the car green. It shows that a method can use `color` directly. |
| `countBuiltCars` and the constructor | 40 | A static counter that goes up each time a car is created. |

### `TestCar`

This program follows the reference slides (21-26).

1. It prints the counter before any car exists. It is 0, because static attributes exist before any object.
2. It declares `a1` and `a2`. These are references, and no car exists yet.
3. It creates a car, stores its reference in `a1`, and paints it yellow.
4. `a2 = a1;` makes both variables point to the same car. This is **aliasing**.
5. It changes the car through `a2`, then prints it through `a1`. The car is green and on, because there is only one car.
6. It sets both references to `null`. Nothing points to that car now, so the garbage collector may remove it.
7. It creates a second car and prints the counter, which is now 2.

**Key idea:** `a2 = a1` copies the reference, not the object.

## 4. `finalattributes`: Values that cannot change

**Files:** `Student.java`, `TestStudent.java` ([open the folder](https://github.com/A-Meca/oop-seminars-2026/tree/main/week-03/Code%20Examples/finalattributes))

### `Student`

This class shows the two ways to give a `final` attribute its value (slide 41).

- `years` gets its value **inline**, where it is declared. Every student has 3.
- `id` gets its value **in the constructor**, so each student can have a different one.

`this.id = id;` is needed because the parameter has the same name as the attribute. `this.id` is the attribute, and `id` is the parameter.

### `TestStudent`

This program creates a student with the id `S001` and prints both attributes.

**Try it:** `TestStudent` contains two lines marked `// WRONG:`, and each one tries to change a `final` attribute. Delete `// WRONG: ` from the start of one line and read the error Eclipse shows. Then put it back.

**Key idea:** a `final` attribute gets its value once, when the object is created, and can't be changed after that.

## Summary

| Concept | Where to see it |
| --- | --- |
| Class and object | `tv.TV`, `tv.TestTV` |
| Constructors | `circle.Circle` |
| `private` fields with getters and setters | `circle.Circle` |
| Separate objects with separate state | `tv.TestTV`, `circle.TestCircle` |
| Array of objects | `circle.TestCircleArray` |
| References, aliasing and `null` | `car.TestCar` |
| Static variables | `car.Car`, `circle.Circle` |
| Static methods | `circle.Circle` |
| `final` attributes | `finalattributes.Student` |
