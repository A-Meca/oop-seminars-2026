# Week 2 · First code: methods, arrays and strings

*Module: Objects and State*

These exercises practice the Java syntax and programming fundamentals: methods, arrays and strings. In the second part of the seminar we start designing the university system on paper.

## Before the seminar
- Read the slides: [Programming in Java: the basics](Slides/seminar-02-programming-in-java.pdf) (see the reading guide below)
- Try the exercises: [Exercises: Methods, Arrays and Strings](Practice%20Exercises/Week_2_Exercises.pdf)
- Read [the scenario](university-scenario.md)

## How to read the slides
The slides are long because they cover all the basics, so you can come back to them as a reference. Much of it is a reminder of what you already know from C: skim those parts quickly. Spend your time on what is new or different in Java.

**New or different in Java: read these carefully**

| Slides | Topic |
|---|---|
| 7 | Reading input from the keyboard with `Scanner` |
| 11 | Constants with `final` |
| 20 | Type casting: Java refuses `int x = 5 / 2.0;` without an explicit cast, which C would accept |
| 23–27, 55 | Dialog boxes with `JOptionPane`, and converting text to numbers with `Integer.parseInt` and `Double.parseDouble` |
| 56–63 | The `Math` class: `Math.pow`, `Math.sqrt`, `Math.random` and more |
| 64–69 | `char` holds Unicode (2 bytes, not 1 as in C), and the `Character` class |
| 70–74 | The `String` type: strings are objects, with their own methods. Compare them with `equals`, never with `==` |
| 154–174 | Arrays: created with `new`, they know their own `length`, have default values, the for-each loop, copying, `Arrays.sort` |
| 175–184 | Two-dimensional arrays: each row is its own array, so rows can have different lengths (ragged arrays) |
| 203–204 | Variable-length argument lists (`int... numbers`) |

**Methods (109–153)**

Parameters, return values and the call stack will look familiar from functions in C, so you can go through most of these slides quickly. But methods are not the same as functions: they belong to a class. Read these carefully:
- 112: declaring a method, with modifiers such as `public static`
- 142–144: arrays and objects are passed to methods as references
- 146–147: overloading, several methods with the same name
- 151–152: static fields versus local variables

This week our methods are `static`. From next week you write methods that belong to objects.

**A reminder from C: skim these**

Variables, types and operators (2–6, 8–10, 12–19), debugging (21–22), selections and `switch` (28–54), loops (75–108), recursion (185–199) and command-line arguments (200–202).

## Lectures
[Your first class](https://evisp.github.io/java-oop-course/01-objects-and-state/first-class/) · [What a variable really holds](https://evisp.github.io/java-oop-course/01-objects-and-state/references/) · [Lecture code](https://github.com/evisp/java-oop-lectures/tree/main/week-02-classes-and-references)

## Solutions
Published after the seminar
