package ZamestnaneckySystem;

public class Manager extends Zamestnanec {
    private int pocetzamestnancu;
    public Manager(String firstname, String lastname, String position, int plat, int pocetzamestnancu) {
        super(firstname, lastname, position, plat);
        this.pocetzamestnancu = pocetzamestnancu;
    }

    @Override
    void vypisInfo() {
        super.vypisInfo();
        System.out.println(pocetzamestnancu);
    }
}
