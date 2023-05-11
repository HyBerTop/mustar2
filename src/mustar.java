//Név: Róth József
//Csoport: I/1/N
//Dátum: 2023.05.11.

import java.util.Scanner;

public class mustar {
    public static void main(String[] args) {
        System.out.println("Név: Róth Jószef");
        System.out.println("Csoport: SZOFT I/1/N");
        System.out.println("Dátum: 2023.05.11.");

        try (Scanner scanner = new Scanner(System.in)) {
            double hossz = getInput(scanner, "Kérem adja meg a tartály A oldalának hosszát: ");
            double szelesseg = getInput(scanner, "Kérem adja meg a tartály B oldalának hosszát: ");
            double magassag = getInput(scanner, "Kérem adja meg a tartály C oldalának hosszát: ");

            double terfogat = terfogatSzamol(hossz, szelesseg, magassag);
            System.out.println("A téglatest alakú tartály-ba beleférő must: " + terfogat);
        }
    }

    public static double terfogatSzamol(double hossz, double szelesseg, double magassag) {
        return hossz * szelesseg * magassag;
    }

    private static double getInput(Scanner scanner, String uzenet) {
        System.out.print(uzenet);
        return scanner.nextDouble();
    }
}