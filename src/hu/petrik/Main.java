package hu.petrik;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> lista= new ArrayList<>();

    public static void main(String[] args) throws IOException {



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


            Beolvas();
            masodikBejegyzesModositasa();




    }
    public static void Beolvas(){
        BufferedReader objReader = null;
        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("bejegyzesek.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                lista.add(strCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void masodikBejegyzesModositasa(){
        System.out.println("Módosítsa a második bejegyzést!");
        String ujbejegyzes;
        lista.set(1,ujbejegyzes = sc.next());
    }
}
