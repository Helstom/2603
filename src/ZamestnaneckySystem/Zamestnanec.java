package ZamestnaneckySystem;

public class Zamestnanec {
    private String firstname;
    private String lastname;
    private String position;
    private int plat;

    public Zamestnanec(String firstname, String lastname, String position, int plat) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.plat = plat;
    }

     void vypisInfo() {
        System.out.print(firstname);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }
}
