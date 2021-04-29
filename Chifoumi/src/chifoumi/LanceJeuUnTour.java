package chifoumi;

import java.util.Scanner;

public class LanceJeuUnTour {
    public static void main (String[] arg) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("C'quoi ton blaze JoueurA?");
        String nomA = clavier.nextLine();
        System.out.println("C'quoi ton blaze JoueurB?");
        String nomB = clavier.nextLine();
        JeuUnTour jut = new JeuUnTour(nomA, nomB);
    }
}
