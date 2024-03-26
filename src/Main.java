import ZamestnaneckySystem.Manager;
import ZamestnaneckySystem.Vyvojar;
import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Manager");
        System.out.println("Napis jmeno");
        String firstname = myObj.nextLine();
        System.out.println("Napis prijmeni");
        String lastname = myObj.nextLine();
        System.out.println("Napis pozici (uklizec atd)");
        String postion = myObj.nextLine();
        System.out.println("zadej plat v KC");
        int plat = myObj.nextInt();
        myObj.nextLine();
        System.out.println("zadej pocet zamestnancu");
        int pocetzamestnancu = myObj.nextInt();
        myObj.nextLine();

        Manager HC = new Manager(firstname,lastname, postion,plat ,pocetzamestnancu);


        System.out.println("Vyvojar");
        System.out.println("Napis jmeno");
        String firstnameVyvojar = myObj.nextLine();
        System.out.println("Napis prijmeni");
        String lastnameVyvojar = myObj.nextLine();
        System.out.println("Napis pozici (uklizec atd)");
        String postionVyvojar = myObj.nextLine();
        System.out.println("zadej plat v KC");
        int platVyvojar = myObj.nextInt();
        myObj.nextLine();
        System.out.println("zadej jazyk");
        String list = myObj.nextLine();

        ArrayList<String> jazyky = new ArrayList<String>();

        jazyky.add(list);
        for (int i = 0; i < list.length(); i++) {

        }

        Vyvojar dev = new Vyvojar(firstnameVyvojar,lastnameVyvojar, postionVyvojar,platVyvojar , jazyky );


    }
}