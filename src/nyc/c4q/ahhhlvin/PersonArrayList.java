package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/24/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.ArrayList;
import java.util.Scanner;


public class PersonArrayList {

    public static void main(String[] args) {
        ArrayList<Person> names = new ArrayList<Person>(); // angle brackets for TYPE of ArrayList
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Please enter some names: ");
            String name = input.nextLine();

            if (name.equals("")) {
                break;
            } else {
                Person person = new Person();
                person.setName(name);
            }
        }

        System.out.println("Your " + names.size() + " name(s) have been saved!");

        // '-1' subtracts out the empty line that is entered to break out of the while loop
        for (int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        System.out.println("\n\nSearch for name(s): ");
        String name = input.nextLine();

        if (names.contains(name)) {
            System.out.println("Yes!!");
        } else {
            System.out.println("No!! :(");
        }


    }
}
