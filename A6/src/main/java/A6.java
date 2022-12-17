import java.util.Scanner; //for user's inputs

/*
 * A6, Q1:
 * 	Create a class Vehicle. 
 *  The class should have two fields:
 *	    no_of_seats and no_of_wheels. 
 *	Create two objects:
 *	    Motorcycle and Car for this class. 
 *	Your output should show the descriptions for Car and Motorcycle
 */

class Vehicle {
    int no_of_seats = 0;
    int no_of_wheels = 0;
    String type_name = "";

    // optional# constructor for Children
    public Vehicle() {

    }

    // constructor
    public Vehicle(String type, int seats, int wheels) {
        type_name = type;
        no_of_seats = seats;
        no_of_wheels = wheels;
    }

    // show description
    public void desc() {
        System.out.println(type_name + " Description: ");
        System.out.println("  Wheels = " + no_of_wheels);
        System.out.println("  Seats = " + no_of_seats);
    }
}

// optional# for Polymorphism
class MotorCycle extends Vehicle {
    public MotorCycle() {
        type_name = "MotorCycle";
        no_of_seats = 2;
        no_of_wheels = 2;
    }
}

// optional# for Polymorphism
class Car extends Vehicle {
    public Car() {
        type_name = "Car";
        no_of_seats = 5;
        no_of_wheels = 4;
    }
}

/*
 * A6, Q2:
 * Create a class with a method. The method has to decide whether a given year *
 * is a leap year or not.
 * Note: A year is considered a leap year if:
 * i. It has an extra day i.e. 366 instead of 365.
 * ii. It occurs every 4 years e.g. 2008, 2012 are leap years.
 * iii. For every 100 years, a special rule applies - 1900 is not a leap year
 * but 2000 is a leap year. In those cases, we need to check whether it is
 * divisible by 400 or not.
 */
class Year {
    // constructor
    public Year() {
        System.out.println("Leap Year Checker:");
    }

    // check a year
    public boolean is_leap_year(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("  Year '" + year + "' is a Leap Year");
            return true;
        }
        System.out.println("  Year '" + year + "' is Not a Leap Year");
        return false;
    }

    // optional# for user input
    public boolean is_leap_year() {
        int year = 0;
        System.out.println("  Please Input a Year : ");
        Scanner scinput = new Scanner(System.in);
        year = scinput.nextInt();
        scinput.close();
        return is_leap_year(year);
    }
}

/*
 * A6, Q3:
 * Create a class with a method to calculate the factorial of a number.
 */

class Calculator {
    // constructor
    public Calculator() {
        System.out.println("Calculator :");
    }

    // calculate the factorial of a number.
    public int factorial_of_number(int num) {
        if (num < 0) {
            System.out.println(" Factorial of a negative number is undefined !!!");
            return 0;
        }
        int ret = 1; // 0! = 1
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        System.out.println("  Factorial of '" + num + "' is '" + ret);
        return ret;
    }

    // optional# for user input
    public int factorial_of_number() {
        int num = 0;
        System.out.println("  Please Input a Number : ");
        Scanner scinput = new Scanner(System.in);
        num = scinput.nextInt();
        scinput.close();
        return factorial_of_number(num);
    }
}

public class A6 {
    public static void main(String[] args) {
        // testing A6, Q1
        Vehicle motorcycle = new Vehicle("MotorCycle", 2, 2); // object 'motorcycle'
        Vehicle car = new Vehicle("Car", 5, 4); // object 'car'
        motorcycle.desc();
        car.desc();

        // optional# testing A6, Q1 for Polymorphism
        Vehicle v1 = new MotorCycle();
        Vehicle v2 = new Car();
        v1.desc();
        v2.desc();

        // testing A6, Q2
        Year year = new Year();
        year.is_leap_year(1900);
        year.is_leap_year(1920);
        year.is_leap_year(2000);

        // optional# testing A6, Q2 for user input
        year.is_leap_year();

        // testing A6, Q3
        Calculator cal = new Calculator();
        cal.factorial_of_number(5);

        // optional# testing A6, Q3 for user input
        cal.factorial_of_number();
    }
}
