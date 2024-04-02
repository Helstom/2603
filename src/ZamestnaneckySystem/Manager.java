package ZamestnaneckySystem;

import java.util.Scanner;

public class Manager extends Zamestnanec {
    private int pocetzamestnancu;
    public Manager() {
        super();
        Scanner myObj = new Scanner(System.in);
        System.out.println("pocet zamestnancu");
        this.pocetzamestnancu = myObj.nextInt();
        myObj.nextLine();
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("pocet zamestnancu");
        System.out.println(pocetzamestnancu);

    }
}
