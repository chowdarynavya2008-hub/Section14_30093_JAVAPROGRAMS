class Car 
{
    // Instance variables
    int speed;

    // Default Constructor
    Car() 
    {
        speed = 60;
    }

    // Parameterized Constructor
    Car(int s) 
    {
        speed = s;
    }

    // Copy Constructor
    Car(Car c) 
    {
        speed = c.speed;
    }

    // Method (or) Member function
    void display() 
    {
        System.out.println("Speed: " + speed);
        System.out.println();
    }
}

public class CarTest 
{
    public static void main(String args[]) 
    {
        // creating Object using default constructor
        Car c2 = new Car();

        // creating Object using parameterized constructor
        Car c1 = new Car(120);

        // creating Object using copy constructor
        Car c3 = new Car(c1);

        c1.display();
        c2.display();
        c3.display();
    }
}