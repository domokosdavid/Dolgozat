package hu.petrik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<String> lista= new ArrayList<>();

        System.out.print("Kérek egy darabszámot!");
        int darabszam = sc.nextInt();
        String bejegyzes;
        int szamlalo = 0;
            do {
                szamlalo++;
                System.out.println("Bejegyzés:");
                bejegyzes = sc.next();
                lista.add(bejegyzes);

            }
            while (szamlalo!=darabszam);

        for (String item:lista
             ) {
            System.out.println(item);
        }

    }
}
