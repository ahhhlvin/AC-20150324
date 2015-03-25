package nyc.c4q.ahhhlvin;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); // angle brackets for TYPE of ArrayList
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Please enter some names: ");

            String name = input.nextLine();

            if (name.equals("")) {
                break;
            } else {
                names.add(name);
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
