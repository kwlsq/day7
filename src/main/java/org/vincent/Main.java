package org.vincent;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = UserInput.scanner();

        List<Integer> numbersEntered = UserInput.numbersEntered();
        System.out.println(numbersEntered);
        System.out.println(NumberUtils.calculateAverage(numbersEntered));

        scanner.close();
    }
}