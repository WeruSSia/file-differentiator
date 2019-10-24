package main;

import file_differentiator.FileDifferentiator;
import file_differentiator.UnhandledExtensionException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, UnhandledExtensionException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input file name: ");
        String filename = scanner.nextLine();
        new FileDifferentiator().differentiate(filename);
    }
}
