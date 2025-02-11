package org.vincent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }

    public static List<Integer> numbersEntered() {
        String inputString;
        List<Integer> numbersList = new ArrayList<>();

        do {
            System.out.println("Enter singular number (or 'q' to quit): ");
            inputString = scanner().nextLine();

            if (!inputString.equalsIgnoreCase("q")) {
                try {
                    numbersList.add(Integer.parseInt(inputString));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                }
            }
        } while (!inputString.equalsIgnoreCase("q"));

        return numbersList;
    }
}
