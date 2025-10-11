# Oops in java:

OOPs (Object-Oriented Programming System) in Java is a programming paradigm that organizes code into objects, which combine data (fields/attributes) and behavior (methods) together.

It makes programs more modular, reusable, and easier to maintain.


# some other concepts:

 	- static variables: this variables is shared by all the objects.
 	- static method: can be called by the main class without creating the object of the class.
```
class Check {
    static String str = "Vatsal";
 
    static void display() {
        System.out.println("This is nothing but something fabulous");
    }
 
}

class Main {
    public static void main(String[] ar) {
        System.out.println(Check.str);
        Check.display();
    }
}

```


# Access Modifiers:

   - Use private for encapsulation. (used only inside the class)

   - Use default for package-level grouping. (can be used in same class and package)
 
   - Use protected for inheritance. (can be used in sub-class)

   - Use public to make accessible everywhere.


# Encapsulation

Wrapping data (variables) and methods into a single unit (class).

It hides the internal details from the outside world.

Achieved using private variables and public getter/setter methods.

```
class Student {
    private int age; // private = hidden data

    public void setAge(int a) {  // setter
        age = a;
    }

    public int getAge() {        // getter
        return age;
    }
}
```
---

# Inheritance

Allows one class to inherit properties and methods of another class.

Promotes code reusability.

Achieved using the extends keyword.

- single inheritance

```
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

```

- Multi-level inheritance
```
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

```

- Hierarchical inheritance
 
    Multiple class can extend the properties from one parent class
```
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}
```

- Multiple Inheritance (using interface)

```
   interface A {
      void show();
   }

   interface B {
      void display();
   }

   class C implements A, B {
       public void show() {
           System.out.println("Show from A");
   }

    public void display() {
        System.out.println("Display from B");
    }
}

```


---
# Abstraction

Abstraction is one of the main pillars of Object-Oriented Programming (OOPs).
It means hiding the implementation details and showing only the essential features of an object.

- abstract method: A method which is abstract does not have a method body.

   void display(); // abstract method
- abstract class: An abstract class is a class that cannot be instantiated (you cannot create its object).

```
abstract class Bank {
    abstract void rateOfInterest(); // no body — only definition
    void bankInfo() {
        System.out.println("Welcome to ABC Bank!");
    }
}

class SBI extends Bank {
    void rateOfInterest() {
        System.out.println("SBI Rate of Interest: 6.5%");
    }
}

class HDFC extends Bank {
    void rateOfInterest() {
        System.out.println("HDFC Rate of Interest: 7.2%");
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        sbi.rateOfInterest();
    }
}

```
---
# Polymorphism
      Polymorphism is an OOP concept that allows one entity (method or object) to take many forms. In Java, it mainly refers to the ability of a single interface or method to work in      different ways depending on the context.

	 compile time polymorphism/ static polymorphism/ method overloading. 
```
	class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      // calls int version
        System.out.println(calc.add(5.5, 3.2));   // calls double version
    }
}
```

- run time polymorphism/ dynamic polymorphism/ method overriding

 ```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference, child object
        a.sound();            // Calls Dog's sound() at runtime
    }
}

```

---

 # Exception handling in java: 
    In Java, an exception is an unexpected event or error that occurs during the execution of a program and disrupts the normal flow of instructions.
    
	.

- Types of Exceptions

Java exceptions are mainly divided into three categories:

- Checked Exceptions

Checked at compile-time.

You must handle them using try-catch or declare using throws.

Examples:

IOException

SQLException

FileNotFoundException

✅ Example:

```
import java.io.*;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
```

2. Unchecked Exceptions (Runtime Exceptions)

Occur during program execution.

Not checked at compile time.

Examples:

ArithmeticException

NullPointerException

ArrayIndexOutOfBoundsException

NumberFormatException

✅ Example:
```

public class UncheckedExample {
    public static void main(String[] args) {
        int a = 10 / 0; // ArithmeticException
    }
}
```

