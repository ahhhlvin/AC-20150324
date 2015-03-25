package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/24/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 * This class creates
 */

import java.util.Scanner;
import java.util.ArrayList;

public class BlueBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Car> demCars = new ArrayList<Car>();

        // uses the Car.java class and create separate instances
        Car car1 = new Car("Honda", "Civic", 1990, 2.00);
        Car car2 = new Car("Toyota", "Previa", 1992, 2.00);
        Car car3 = new Car("Hyundai", "Hans", 1989, 2.00);
        Car car4 = new Car("Tesla", "S", 1990, 2.00);

        // adds each instance created into the ArrayList, demCars
        demCars.add(car1);
        demCars.add(car2);
        demCars.add(car3);
        demCars.add(car4);


        System.out.println("Please enter a make: ");
        String make = input.nextLine();
        System.out.println("Please enter a model: ");
        String model = input.nextLine();
        System.out.println("Please enter a year: ");
        int year = input.nextInt();


        for (int i=0; i < demCars.size(); i++) {


            // ALWAYS use 'ARRAYLISTNAME.get(i).METHOD
            if (make == demCars.get(i).getMake() && model == demCars.get(i).getModel() && year == demCars.get(i).getYear())
            // Use '==' for checking if values are EQUAL !
            {
                System.out.println("The price of that car is: " + demCars.get(i).getPrice());
            } else {
                System.out.println("That car is not within the BlueBook list!");
                System.out.println("Please put in the the relevant information so it can be added to the BlueBook list...");

                System.out.println("Please enter a make: ");
                String makeInput2 = input.next();
                System.out.println("Please enter a model: ");
                String modelInput = input.next();
                System.out.println("Please enter a year: ");
                int yearInput = input.nextInt();
                System.out.println("Please enter the price: ");
                double priceInput = input.nextDouble();

                Car car5 = new Car (makeInput2, modelInput, yearInput, priceInput);
                demCars.add(car5);

                System.out.print("Thank you! The new car with the following details has been added to the BlueBook list! \n\n" + "Make: " + makeInput2 + "\nModel: " + modelInput + "\nYear: " + yearInput + "\nPrice: " + priceInput);
                break;
            }
        }


    }


}

