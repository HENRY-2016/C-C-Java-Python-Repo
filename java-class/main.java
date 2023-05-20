
// https://www.w3schools.com/java/default.asp


import java.util.Scanner;

public class main 
{
    public static void main2 (String []args) {
        System.out.println("java class"); // prints Hello World

        // Arrays    
            String[] Fruits = {"apple", "bananas","mangoes", "watermelons", "oranges"};
            System.out.println(Fruits[1]);
            
        // ===========
        // 03-02-2022
        // ===========
        // read user input
            Scanner username = new Scanner (System.in); // object scanner

            System.out.println("Enter User Name..");
            String username_input = username.nextLine (); // read input
            System.out.println("User Name is ::: "+ username_input);


        // Type Casting
            //  1) widening 
                int int_number = 5;
                double double_number = int_number;

                System.out.println("int_number ::" + int_number);
                System.out.println("Converted double_number ::" + double_number);

            //  1) Narrowing 
                double Narrowing_double_number = 7.02;
                int Narrowing_int_number = (int) Narrowing_double_number;

                System.out.println("Narrowing_double_number ::" + Narrowing_double_number);
                System.out.println("Converted Narrowing_int_number ::" + Narrowing_int_number);

        // ==========
        // 10-02-2022
        // ===========
        // defined inside main class
        // public static void printName (){System.out.println("My Name is Java");}
            // public static void studentsNames ( String student1, String student2)
            // {
            //     System.out.println("Student One is ::" + student1);
            //     System.out.println("Student Two is ::" + student2);
        
            // }

        // conditions
        if (20 > 18) {System.out.println("20 is greater than 18");}

        int time = 20;
        if (time < 18) 
            {System.out.println("Good day.");} 
        else 
            {System.out.println("Good evening.");}

        //
        if (time < 10) 
            {System.out.println("Good morning.");} 
        else if (time < 20) 
            {System.out.println("Good day.");}  
        else 
            {System.out.println("Good evening.");}

        // 
        int day = 4;
    switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }

        // while loop
        int i = 0;
        while (i < 5) {
                System.out.println(i);
                i++;
            }
        // do while
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        // for loop
        for (int o = 0; o < 5; o++) 
            {System.out.println(o);}

    }
}



// Object-Oriented Programming(OOP)
// Objects multiple
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
    }

// Methods
//==================
/// Class Methods
public class Main {
    static void myMethod() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        myMethod();
    }
    }

// Static vs. Non-Static
    public class Main {
        // Static method
        static void myStaticMethod() {
            System.out.println("Static methods can be called without creating objects");
        }
        
        // Public method
        public void myPublicMethod() {
            System.out.println("Public methods must be called by creating objects");
        }
        
        // Main method
        public static void main(String[] args) {
            myStaticMethod(); // Call the static method
        
            Main myObj = new Main(); // Create an object of MyClass
            myObj.myPublicMethod(); // Call the public method
        }
        }
// Constructors
// Create a Main class
    public class Main {
        int x;
    
        // Create a class constructor for the Main class
        public Main() {
        x = 5;
        }
    
        public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        }
    }


    //  Inheritance 
    class Vehicle {
        protected String brand = "Ford";
        public void honk() {
            System.out.println("Tuut, tuut!");
        }
        }
        
        class Car extends Vehicle {
        private String modelName = "Mustang";
        public static void main(String[] args) {
            Car myFastCar = new Car();
            myFastCar.honk();
            System.out.println(myFastCar.brand + " " + myFastCar.modelName);
        }
        }
// Polymorphism
    class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
    }

    class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    }

    class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
    }

    class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
            
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
    }
